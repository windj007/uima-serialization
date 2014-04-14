

/* First created by JCasGen Sun Apr 13 00:10:16 MSK 2014 */
package org.apache.uima.json.serialization.test.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Apr 13 00:10:16 MSK 2014
 * XML source: /home/windj/projects/uima-json-serialization/src/main/resources/desc/type/TestTypeSystem.xml
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
      jcasType.jcas.throwFeatMissing("string", "org.apache.uima.json.serialization.test.type.First");
    return jcasType.ll_cas.ll_getStringValue(addr, ((First_Type)jcasType).casFeatCode_string);}
    
  /** setter for string - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setString(String v) {
    if (First_Type.featOkTst && ((First_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "org.apache.uima.json.serialization.test.type.First");
    jcasType.ll_cas.ll_setStringValue(addr, ((First_Type)jcasType).casFeatCode_string, v);}    
  }

    