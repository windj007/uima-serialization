package org.apache.uima.serialization.json;

import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.IOUtils;

public class SimpleFileTransformBuilder implements ITransformBuilder {
	private String	forward	= null;
	private String	reverse	= null;

	public SimpleFileTransformBuilder(String forwardXsltFile, String reverseXsltFile) {
		this.forward = forwardXsltFile;
		this.reverse = reverseXsltFile;
	}

	public Transformer getForwardTransformer()
		throws TransformerConfigurationException {
		return loadTransformer(forward);
	}

	public Transformer getReverseTransformer()
		throws TransformerConfigurationException {
		return loadTransformer(reverse);
	}

	protected Transformer loadTransformer(String resource)
		throws TransformerConfigurationException {
		InputStream xsltStr = null;
		try {
			xsltStr = getClass().getResourceAsStream(resource);
			return TransformerFactory.newInstance().newTransformer(
				new StreamSource(xsltStr));
		} finally {
			IOUtils.closeQuietly(xsltStr);
		}
	}
}
