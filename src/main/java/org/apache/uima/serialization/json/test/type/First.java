

/* First created by JCasGen Tue Apr 15 16:47:14 MSK 2014 */
package org.apache.uima.serialization.json.test.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.jcas.cas.BooleanArray;
import org.apache.uima.jcas.cas.Sofa;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.cas.IntegerList;


/** 
 * Updated by JCasGen Tue Apr 15 16:47:14 MSK 2014
 * XML source: /home/rsuvorov/projects/uima-json-serialization/src/main/resources/desc/type/TestTypeSystem.xml
 * @generated */
public class First extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(First.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected First() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public First(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public First(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public First(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: string

  /** getter for string - gets 
   * @generated
   * @return value of the feature 
   */
  public String getString() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "org.apache.uima.serialization.json.test.type.First");
    return jcasType.ll_cas.ll_getStringValue(addr, ((First_Type)jcasType).casFeatCode_string);}
    
  /** setter for string - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setString(String v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setStringValue(addr, ((First_Type)jcasType).casFeatCode_string, v);}    
   
    
  //*--------------*
  //* Feature: annot

  /** getter for annot - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnnot() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_annot == null)
      jcasType.jcas.throwFeatMissing("annot", "org.apache.uima.serialization.json.test.type.First");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_annot)));}
    
  /** setter for annot - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnot(Annotation v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_annot == null)
      jcasType.jcas.throwFeatMissing("annot", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_annot, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bool

  /** getter for bool - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getBool() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_bool == null)
      jcasType.jcas.throwFeatMissing("bool", "org.apache.uima.serialization.json.test.type.First");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((First_Type)jcasType).casFeatCode_bool);}
    
  /** setter for bool - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBool(boolean v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_bool == null)
      jcasType.jcas.throwFeatMissing("bool", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((First_Type)jcasType).casFeatCode_bool, v);}    
   
    
  //*--------------*
  //* Feature: boolArray

  /** getter for boolArray - gets 
   * @generated
   * @return value of the feature 
   */
  public BooleanArray getBoolArray() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_boolArray == null)
      jcasType.jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    return (BooleanArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_boolArray)));}
    
  /** setter for boolArray - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBoolArray(BooleanArray v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_boolArray == null)
      jcasType.jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_boolArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for boolArray - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public boolean getBoolArray(int i) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_boolArray == null)
      jcasType.jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_boolArray), i);
    return jcasType.ll_cas.ll_getBooleanArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_boolArray), i);}

  /** indexed setter for boolArray - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setBoolArray(int i, boolean v) { 
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_boolArray == null)
      jcasType.jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_boolArray), i);
    jcasType.ll_cas.ll_setBooleanArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_boolArray), i, v);}
   
    
  //*--------------*
  //* Feature: integer

  /** getter for integer - gets 
   * @generated
   * @return value of the feature 
   */
  public int getInteger() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_integer == null)
      jcasType.jcas.throwFeatMissing("integer", "org.apache.uima.serialization.json.test.type.First");
    return jcasType.ll_cas.ll_getIntValue(addr, ((First_Type)jcasType).casFeatCode_integer);}
    
  /** setter for integer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInteger(int v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_integer == null)
      jcasType.jcas.throwFeatMissing("integer", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setIntValue(addr, ((First_Type)jcasType).casFeatCode_integer, v);}    
   
    
  //*--------------*
  //* Feature: doubleArray

  /** getter for doubleArray - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getDoubleArray() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_doubleArray == null)
      jcasType.jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_doubleArray)));}
    
  /** setter for doubleArray - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDoubleArray(DoubleArray v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_doubleArray == null)
      jcasType.jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_doubleArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for doubleArray - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getDoubleArray(int i) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_doubleArray == null)
      jcasType.jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_doubleArray), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_doubleArray), i);}

  /** indexed setter for doubleArray - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDoubleArray(int i, double v) { 
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_doubleArray == null)
      jcasType.jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_doubleArray), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_doubleArray), i, v);}
   
    
  //*--------------*
  //* Feature: first

  /** getter for first - gets 
   * @generated
   * @return value of the feature 
   */
  public First getFirst() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_first == null)
      jcasType.jcas.throwFeatMissing("first", "org.apache.uima.serialization.json.test.type.First");
    return (First)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_first)));}
    
  /** setter for first - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirst(First v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_first == null)
      jcasType.jcas.throwFeatMissing("first", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_first, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: integerList

  /** getter for integerList - gets 
   * @generated
   * @return value of the feature 
   */
  public IntegerList getIntegerList() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_integerList == null)
      jcasType.jcas.throwFeatMissing("integerList", "org.apache.uima.serialization.json.test.type.First");
    return (IntegerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_integerList)));}
    
  /** setter for integerList - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIntegerList(IntegerList v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_integerList == null)
      jcasType.jcas.throwFeatMissing("integerList", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_integerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: second

  /** getter for second - gets 
   * @generated
   * @return value of the feature 
   */
  public Second getSecond() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_second == null)
      jcasType.jcas.throwFeatMissing("second", "org.apache.uima.serialization.json.test.type.First");
    return (Second)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_second)));}
    
  /** setter for second - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSecond(Second v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_second == null)
      jcasType.jcas.throwFeatMissing("second", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_second, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: refToSofa

  /** getter for refToSofa - gets 
   * @generated
   * @return value of the feature 
   */
  public Sofa getRefToSofa() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_refToSofa == null)
      jcasType.jcas.throwFeatMissing("refToSofa", "org.apache.uima.serialization.json.test.type.First");
    return (Sofa)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_refToSofa)));}
    
  /** setter for refToSofa - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRefToSofa(Sofa v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_refToSofa == null)
      jcasType.jcas.throwFeatMissing("refToSofa", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_refToSofa, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: docAnnot

  /** getter for docAnnot - gets 
   * @generated
   * @return value of the feature 
   */
  public DocumentAnnotation getDocAnnot() {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_docAnnot == null)
      jcasType.jcas.throwFeatMissing("docAnnot", "org.apache.uima.serialization.json.test.type.First");
    return (DocumentAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((First_Type)jcasType).casFeatCode_docAnnot)));}
    
  /** setter for docAnnot - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocAnnot(DocumentAnnotation v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_docAnnot == null)
      jcasType.jcas.throwFeatMissing("docAnnot", "org.apache.uima.serialization.json.test.type.First");
    jcasType.ll_cas.ll_setRefValue(addr, ((First_Type)jcasType).casFeatCode_docAnnot, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    