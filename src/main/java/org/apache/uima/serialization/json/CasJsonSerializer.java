package org.apache.uima.serialization.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.IOUtils;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.impl.XCASDeserializer;
import org.apache.uima.cas.impl.XCASSerializer;
import org.apache.uima.serialization.ICasSerializer;
import org.apache.uima.serialization.exceptions.CasSerializationException;
import org.apache.uima.serialization.exceptions.SerializerInitializationException;
import org.json.JSONObject;
import org.json.XML;
import org.xml.sax.SAXException;

public class CasJsonSerializer implements ICasSerializer {
	Transformer	xcasToJson	= null;
	Transformer	jsonToXCas	= null;

	private int	indent		= 0;

	public CasJsonSerializer(ITransformBuilder transformBuilder)
		throws SerializerInitializationException {
		this(transformBuilder, 0);
	}

	public CasJsonSerializer(ITransformBuilder transformBuilder,
		int indent) throws SerializerInitializationException {
		this.indent = indent;
		try {
			xcasToJson = transformBuilder.getForwardTransformer();
			jsonToXCas = transformBuilder.getReverseTransformer();
		} catch (TransformerConfigurationException e) {
			throw new SerializerInitializationException(e);
		}
	}

	public String serialize(CAS doc) throws CasSerializationException {
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
			return obj.toString(indent);
		} catch (SAXException e) {
			throw new CasSerializationException(e);
		} catch (TransformerException e) {
			throw new CasSerializationException(e);
		} catch (IOException e) {
			throw new CasSerializationException(e);
		} finally {
			IOUtils.closeQuietly(outTmp);
			IOUtils.closeQuietly(inTmp);
		}
	}

	public void deserialize(CAS doc, String src)
		throws CasSerializationException {
		ByteArrayInputStream inTmp = null;
		ByteArrayOutputStream outTmp = null;
		try {
			outTmp = new ByteArrayOutputStream();
			inTmp = new ByteArrayInputStream(
				XML.toString(new JSONObject(src)).getBytes());

			jsonToXCas.transform(new StreamSource(inTmp), new StreamResult(
				outTmp));

			inTmp.close();
			inTmp = new ByteArrayInputStream(outTmp.toByteArray());

			XCASDeserializer.deserialize(inTmp, doc);
		} catch (SAXException e) {
			throw new CasSerializationException(e);
		} catch (IOException e) {
			throw new CasSerializationException(e);
		} catch (TransformerException e) {
			throw new CasSerializationException(e);
		} finally {
			IOUtils.closeQuietly(inTmp);
			IOUtils.closeQuietly(outTmp);
		}
	}
}
