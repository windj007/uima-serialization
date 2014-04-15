package org.apache.uima.serialization;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.uima.UimaContext;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.serialization.exceptions.CasSerializationException;
import org.apache.uima.serialization.exceptions.UimaSerializationBaseException;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;
import org.uimafit.component.JCasCollectionReader_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;
import org.uimafit.factory.ConfigurationParameterFactory;

public class SerializedCasFileReader extends JCasCollectionReader_ImplBase {
	public static final String	PARAM_SERIALIZER_FACTORY	= ConfigurationParameterFactory.createConfigurationParameterName(
																SerializedCasFileReader.class,
																"serializerFactoryName");

	public static final String	PARAM_INPUT_DIRECTORY		= ConfigurationParameterFactory.createConfigurationParameterName(
																SerializedCasFileReader.class,
																"inputDirectory");

	@ConfigurationParameter(mandatory = false, description = "Name of factory to get the serializer")
	private String				serializerFactoryName;

	@ConfigurationParameter(mandatory = true, description = "Directory from which to read documents")
	private File				inputDirectory;

	private File[]				files;
	private int					filesRead					= 0;

	private ICasSerializer		serializer;

	@Override
	public void initialize(UimaContext context)
		throws ResourceInitializationException {
		super.initialize(context);

		files = inputDirectory.listFiles();

		try {
			serializer = CasSerializerMetaFactory.Instance().getFactory(
				serializerFactoryName).createSerializer();
		} catch (UimaSerializationBaseException e) {
			throw new ResourceInitializationException(e);
		}
	}

	public boolean hasNext() throws IOException, CollectionException {
		return filesRead < files.length;
	}

	public Progress[] getProgress() {
		return new Progress[] { new ProgressImpl(
			filesRead,
			files.length,
			Progress.ENTITIES) };
	}

	@Override
	public void getNext(JCas jCas) throws IOException, CollectionException {
		ByteArrayOutputStream outBuf = null;
		InputStream inBuf = null;
		try {
			inBuf = new FileInputStream(files[filesRead]);
			outBuf = new ByteArrayOutputStream();
			IOUtils.copy(inBuf, outBuf);

			serializer.deserialize(jCas.getCas(), outBuf.toString());
		} catch (CasSerializationException e) {
			throw new IOException(String.format(
				"Could not deserialize CAS from file %s",
				files[filesRead]), e);
		} finally {
			IOUtils.closeQuietly(inBuf);
			IOUtils.closeQuietly(outBuf);
		}
	}
}
