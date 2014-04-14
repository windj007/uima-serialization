package org.apache.uima.json.serialization;

import java.io.IOException;

import static org.junit.Assert.*;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.json.serialization.test.TestAnnotator;
import org.apache.uima.resource.ResourceInitializationException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.uimafit.factory.AnalysisEngineFactory;

public class CasJsonSerializerTest {
	@Rule
	public TemporaryFolder	folder	= new TemporaryFolder();

	@Test
	public void simpleSerializationTest()
		throws ResourceInitializationException, IOException,
		AnalysisEngineProcessException, SerializerInitializationException,
		CasJsonSerializationException {
		AnalysisEngine ae = AnalysisEngineFactory.createPrimitive(TestAnnotator.class);

		JCas doc = ae.newJCas();
		ae.process(doc);

		CasJsonSerializer serializer = new CasJsonSerializer(null, null);
		String serialized = serializer.serialize(doc.getCas());

		JCas doc2 = ae.newJCas();
		serializer.deserialize(doc2.getCas(), serialized);
		
		String serialized2 = serializer.serialize(doc2.getCas());
		
		assertTrue(serialized.equals(serialized2));
	}
}
