package org.apache.uima.json.serialization.test;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.json.serialization.test.type.First;
import org.apache.uima.json.serialization.test.type.Second;
import org.uimafit.component.JCasAnnotator_ImplBase;
import org.uimafit.descriptor.TypeCapability;

@TypeCapability(outputs = {
	"org.apache.uima.json.serialization.test.type.First",
	"org.apache.uima.json.serialization.test.type.Second" })
public class TestAnnotator extends JCasAnnotator_ImplBase {
	@Override
	public void process(JCas doc) throws AnalysisEngineProcessException {
		doc.setDocumentText("Lorem ipsum dolor sit amet.");
		First f = new First(doc, 1, 3);
		f.setString("String value");
		f.addToIndexes();
		Second s = new Second(doc, 6, 10);
		s.addToIndexes();
	}
}
