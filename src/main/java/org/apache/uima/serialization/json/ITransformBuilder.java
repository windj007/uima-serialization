package org.apache.uima.serialization.json;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;

public interface ITransformBuilder {
	Transformer getForwardTransformer() throws TransformerConfigurationException;

	Transformer getReverseTransformer() throws TransformerConfigurationException;
}
