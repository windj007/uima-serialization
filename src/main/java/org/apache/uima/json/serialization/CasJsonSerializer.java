package org.apache.uima.json.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.IOUtils;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.impl.XCASDeserializer;
import org.apache.uima.cas.impl.XCASSerializer;
import org.json.JSONObject;
import org.json.XML;
import org.xml.sax.SAXException;

public class CasJsonSerializer {
	private String[]	featuresOfInterest	= null;
	private String[]	fullTextFeatures	= null;

	Transformer			xcasToJson			= null;
	Transformer			jsonToXCas			= null;

	public CasJsonSerializer(String[] featuresOfInterest,
		String[] fullTextFeatures) throws SerializerInitializationException {
		this.featuresOfInterest = featuresOfInterest;
		this.fullTextFeatures = fullTextFeatures;

		try {
			xcasToJson = getTransformer("transformations/xCasToJsonBase.xslt");
			jsonToXCas = getTransformer("transformations/jsonToXCasBase.xslt");
		} catch (TransformerConfigurationException e) {
			throw new SerializerInitializationException(e);
		}
	}

	public String serialize(CAS doc) throws CasJsonSerializationException {
		ByteArrayOutputStream outTmp = null;
		ByteArrayInputStream inTmp = null;
		try {
			outTmp = new ByteArrayOutputStream();
			XCASSerializer.serialize(doc, outTmp);

			String originalXml = outTmp.toString();
			outTmp.close();

			outTmp = new ByteArrayOutputStream();
			inTmp = new ByteArrayInputStream(originalXml.getBytes());
			xcasToJson.transform(new StreamSource(inTmp), new StreamResult(
				outTmp));

			JSONObject obj = XML.toJSONObject(outTmp.toString());
			return obj.toString();
		} catch (SAXException e) {
			throw new CasJsonSerializationException(e);
		} catch (TransformerException e) {
			throw new CasJsonSerializationException(e);
		} catch (IOException e) {
			throw new CasJsonSerializationException(e);
		} finally {
			IOUtils.closeQuietly(outTmp);
			IOUtils.closeQuietly(inTmp);
		}
	}

	public void deserialize(CAS doc, String src) throws CasJsonSerializationException {
		ByteArrayInputStream inTmp = null;
		ByteArrayOutputStream outTmp = null;
		try {
			outTmp = new ByteArrayOutputStream();
			inTmp = new ByteArrayInputStream(XML.toString(new JSONObject(src)).getBytes());
			
			jsonToXCas.transform(new StreamSource(inTmp), new StreamResult(
				outTmp));
			
			inTmp.close();
			inTmp = new ByteArrayInputStream(outTmp.toByteArray());
			
			XCASDeserializer.deserialize(inTmp, doc);
		} catch (SAXException e) {
			throw new CasJsonSerializationException(e);
		} catch (IOException e) {
			throw new CasJsonSerializationException(e);
		} catch (TransformerException e) {
			throw new CasJsonSerializationException(e);
		} finally {
			IOUtils.closeQuietly(inTmp);
			IOUtils.closeQuietly(outTmp);
		}
	}

	private Transformer getTransformer(String resource)
		throws TransformerConfigurationException,
		TransformerFactoryConfigurationError {
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
