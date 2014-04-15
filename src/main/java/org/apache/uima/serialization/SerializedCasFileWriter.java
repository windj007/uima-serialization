package org.apache.uima.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.serialization.exceptions.CasSerializationException;
import org.apache.uima.serialization.exceptions.UimaSerializationBaseException;
import org.uimafit.component.JCasConsumer_ImplBase;
import org.uimafit.component.xwriter.XWriterFileNamer;
import org.uimafit.descriptor.ConfigurationParameter;
import org.uimafit.factory.ConfigurationParameterFactory;
import org.uimafit.factory.initializable.InitializableFactory;

public class SerializedCasFileWriter extends JCasConsumer_ImplBase {
	public static final String	PARAM_SERIALIZER_FACTORY	= ConfigurationParameterFactory.createConfigurationParameterName(
																SerializedCasFileWriter.class,
																"serializerFactoryName");

	public static final String	PARAM_OUTPUT_DIRECTORY_NAME	= ConfigurationParameterFactory.createConfigurationParameterName(
																SerializedCasFileWriter.class,
																"outputDirectoryName");

	public static final String	PARAM_FILE_NAMER_CLASS_NAME	= ConfigurationParameterFactory.createConfigurationParameterName(
																SerializedCasFileWriter.class,
																"fileNamerClassName");

	@ConfigurationParameter(mandatory = false, description = "Name of factory to get the serializer")
	private String				serializerFactoryName;

	@ConfigurationParameter(mandatory = true, description = "takes a path to directory into which output files will be written.")
	private String				outputDirectoryName;

	@ConfigurationParameter(mandatory = true, description = "the class name of the XWriterFileNamer implementation to use", defaultValue = "org.uimafit.component.xwriter.IntegerFileNamer")
	private String				fileNamerClassName;

	private ICasSerializer		serializer;

	private File				outputDirectory;
	private XWriterFileNamer	fileNamer;

	@Override
	public void initialize(UimaContext context)
		throws ResourceInitializationException {
		super.initialize(context);

		outputDirectory = new File(outputDirectoryName);
		if (!outputDirectory.exists()) {
			outputDirectory.mkdirs();
		}

		fileNamer = InitializableFactory.create(
			context,
			fileNamerClassName,
			XWriterFileNamer.class);

		try {
			serializer = CasSerializerMetaFactory.Instance().getFactory(
				serializerFactoryName).createSerializer();
		} catch (UimaSerializationBaseException e) {
			throw new ResourceInitializationException(e);
		}
	}

	@Override
	public void process(JCas doc) throws AnalysisEngineProcessException {
		String fileName = fileNamer.nameFile(doc);
		FileOutputStream ostr = null;
		try {
			ostr = new FileOutputStream(new File(outputDirectory, fileName
				+ ".json"));
			ostr.write(serializer.serialize(doc.getCas()).getBytes());
		} catch (CasSerializationException e) {
			throw new AnalysisEngineProcessException(e);
		} catch (IOException e) {
			throw new AnalysisEngineProcessException(e);
		} finally {
			IOUtils.closeQuietly(ostr);
		}
	}
}
