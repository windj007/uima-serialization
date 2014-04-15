package org.apache.uima.serialization.json.test;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.BooleanArray;
import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.cas.EmptyIntegerList;
import org.apache.uima.jcas.cas.NonEmptyIntegerList;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.serialization.json.test.type.First;
import org.apache.uima.serialization.json.test.type.Second;
import org.uimafit.component.JCasAnnotator_ImplBase;
import org.uimafit.descriptor.TypeCapability;

@TypeCapability(outputs = {
	"org.apache.uima.json.serialization.test.type.First",
	"org.apache.uima.json.serialization.test.type.Second" })
public class TestAnnotator extends JCasAnnotator_ImplBase {
	@Override
	public void process(JCas doc) throws AnalysisEngineProcessException {
		doc.setDocumentText("Lorem ipsum dolor sit amet.");
		
		Second s1 = new Second(doc, 6, 10);
		s1.addToIndexes();
		
		Second s2 = new Second(doc, 5, 9);
		s2.addToIndexes();
		
		First f = new First(doc, 6, 11);
		
		f.setAnnot(s1);
		f.setBool(true);
		
		BooleanArray boolArr = new BooleanArray(doc, 5);
		boolArr.set(2, true);
		f.setBoolArray(boolArr);
		
		f.setDocAnnot((DocumentAnnotation) doc.getDocumentAnnotationFs());
		
		DoubleArray doubleArr = new DoubleArray(doc, 3);
		doubleArr.set(0, 1.345);
		f.setDoubleArray(doubleArr);
		
		f.setFirst(f);
		
		f.setInteger(123);
		
		EmptyIntegerList listEnd = new EmptyIntegerList(doc);
		NonEmptyIntegerList list2 = new NonEmptyIntegerList(doc);
		list2.setHead(345);
		list2.setTail(listEnd);
		NonEmptyIntegerList list1 = new NonEmptyIntegerList(doc);
		list1.setHead(5467);
		list1.setTail(list2);
		
		f.setIntegerList(list1);
		
		f.setRefToSofa(doc.getSofa());
		
		f.setSecond(s2);
		
		f.setString("String value");
		
		f.addToIndexes();
		
		First f2 = new First(doc);
		f2.setFirst(f2);
		f2.addToIndexes();
	}
}
