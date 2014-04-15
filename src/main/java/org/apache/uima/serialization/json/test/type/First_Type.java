
/* First created by JCasGen Tue Apr 15 16:47:14 MSK 2014 */
package org.apache.uima.serialization.json.test.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Apr 15 16:47:14 MSK 2014
 * @generated */
public class First_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (First_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = First_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new First(addr, First_Type.this);
  			   First_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new First(addr, First_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = First.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.serialization.json.test.type.First");
 
  /** @generated */
  final Feature casFeat_string;
  /** @generated */
  final int     casFeatCode_string;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getString(int addr) {
        if (featOkTst && casFeat_string == null)
      jcas.throwFeatMissing("string", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getStringValue(addr, casFeatCode_string);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setString(int addr, String v) {
        if (featOkTst && casFeat_string == null)
      jcas.throwFeatMissing("string", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setStringValue(addr, casFeatCode_string, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annot;
  /** @generated */
  final int     casFeatCode_annot;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnot(int addr) {
        if (featOkTst && casFeat_annot == null)
      jcas.throwFeatMissing("annot", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_annot);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnot(int addr, int v) {
        if (featOkTst && casFeat_annot == null)
      jcas.throwFeatMissing("annot", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_annot, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bool;
  /** @generated */
  final int     casFeatCode_bool;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getBool(int addr) {
        if (featOkTst && casFeat_bool == null)
      jcas.throwFeatMissing("bool", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_bool);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBool(int addr, boolean v) {
        if (featOkTst && casFeat_bool == null)
      jcas.throwFeatMissing("bool", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_bool, v);}
    
  
 
  /** @generated */
  final Feature casFeat_boolArray;
  /** @generated */
  final int     casFeatCode_boolArray;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBoolArray(int addr) {
        if (featOkTst && casFeat_boolArray == null)
      jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_boolArray);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBoolArray(int addr, int v) {
        if (featOkTst && casFeat_boolArray == null)
      jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_boolArray, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public boolean getBoolArray(int addr, int i) {
        if (featOkTst && casFeat_boolArray == null)
      jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getBooleanArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_boolArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_boolArray), i);
	return ll_cas.ll_getBooleanArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_boolArray), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setBoolArray(int addr, int i, boolean v) {
        if (featOkTst && casFeat_boolArray == null)
      jcas.throwFeatMissing("boolArray", "org.apache.uima.serialization.json.test.type.First");
    if (lowLevelTypeChecks)
      ll_cas.ll_setBooleanArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_boolArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_boolArray), i);
    ll_cas.ll_setBooleanArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_boolArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_integer;
  /** @generated */
  final int     casFeatCode_integer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getInteger(int addr) {
        if (featOkTst && casFeat_integer == null)
      jcas.throwFeatMissing("integer", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getIntValue(addr, casFeatCode_integer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInteger(int addr, int v) {
        if (featOkTst && casFeat_integer == null)
      jcas.throwFeatMissing("integer", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setIntValue(addr, casFeatCode_integer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_doubleArray;
  /** @generated */
  final int     casFeatCode_doubleArray;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDoubleArray(int addr) {
        if (featOkTst && casFeat_doubleArray == null)
      jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDoubleArray(int addr, int v) {
        if (featOkTst && casFeat_doubleArray == null)
      jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_doubleArray, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getDoubleArray(int addr, int i) {
        if (featOkTst && casFeat_doubleArray == null)
      jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setDoubleArray(int addr, int i, double v) {
        if (featOkTst && casFeat_doubleArray == null)
      jcas.throwFeatMissing("doubleArray", "org.apache.uima.serialization.json.test.type.First");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_doubleArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_first;
  /** @generated */
  final int     casFeatCode_first;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFirst(int addr) {
        if (featOkTst && casFeat_first == null)
      jcas.throwFeatMissing("first", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_first);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFirst(int addr, int v) {
        if (featOkTst && casFeat_first == null)
      jcas.throwFeatMissing("first", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_first, v);}
    
  
 
  /** @generated */
  final Feature casFeat_integerList;
  /** @generated */
  final int     casFeatCode_integerList;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIntegerList(int addr) {
        if (featOkTst && casFeat_integerList == null)
      jcas.throwFeatMissing("integerList", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_integerList);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIntegerList(int addr, int v) {
        if (featOkTst && casFeat_integerList == null)
      jcas.throwFeatMissing("integerList", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_integerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_second;
  /** @generated */
  final int     casFeatCode_second;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSecond(int addr) {
        if (featOkTst && casFeat_second == null)
      jcas.throwFeatMissing("second", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_second);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSecond(int addr, int v) {
        if (featOkTst && casFeat_second == null)
      jcas.throwFeatMissing("second", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_second, v);}
    
  
 
  /** @generated */
  final Feature casFeat_refToSofa;
  /** @generated */
  final int     casFeatCode_refToSofa;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRefToSofa(int addr) {
        if (featOkTst && casFeat_refToSofa == null)
      jcas.throwFeatMissing("refToSofa", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_refToSofa);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRefToSofa(int addr, int v) {
        if (featOkTst && casFeat_refToSofa == null)
      jcas.throwFeatMissing("refToSofa", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_refToSofa, v);}
    
  
 
  /** @generated */
  final Feature casFeat_docAnnot;
  /** @generated */
  final int     casFeatCode_docAnnot;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDocAnnot(int addr) {
        if (featOkTst && casFeat_docAnnot == null)
      jcas.throwFeatMissing("docAnnot", "org.apache.uima.serialization.json.test.type.First");
    return ll_cas.ll_getRefValue(addr, casFeatCode_docAnnot);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocAnnot(int addr, int v) {
        if (featOkTst && casFeat_docAnnot == null)
      jcas.throwFeatMissing("docAnnot", "org.apache.uima.serialization.json.test.type.First");
    ll_cas.ll_setRefValue(addr, casFeatCode_docAnnot, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public First_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_string = jcas.getRequiredFeatureDE(casType, "string", "uima.cas.String", featOkTst);
    casFeatCode_string  = (null == casFeat_string) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_string).getCode();

 
    casFeat_annot = jcas.getRequiredFeatureDE(casType, "annot", "uima.tcas.Annotation", featOkTst);
    casFeatCode_annot  = (null == casFeat_annot) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annot).getCode();

 
    casFeat_bool = jcas.getRequiredFeatureDE(casType, "bool", "uima.cas.Boolean", featOkTst);
    casFeatCode_bool  = (null == casFeat_bool) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bool).getCode();

 
    casFeat_boolArray = jcas.getRequiredFeatureDE(casType, "boolArray", "uima.cas.BooleanArray", featOkTst);
    casFeatCode_boolArray  = (null == casFeat_boolArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_boolArray).getCode();

 
    casFeat_integer = jcas.getRequiredFeatureDE(casType, "integer", "uima.cas.Integer", featOkTst);
    casFeatCode_integer  = (null == casFeat_integer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_integer).getCode();

 
    casFeat_doubleArray = jcas.getRequiredFeatureDE(casType, "doubleArray", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_doubleArray  = (null == casFeat_doubleArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_doubleArray).getCode();

 
    casFeat_first = jcas.getRequiredFeatureDE(casType, "first", "org.apache.uima.serialization.json.test.type.First", featOkTst);
    casFeatCode_first  = (null == casFeat_first) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_first).getCode();

 
    casFeat_integerList = jcas.getRequiredFeatureDE(casType, "integerList", "uima.cas.IntegerList", featOkTst);
    casFeatCode_integerList  = (null == casFeat_integerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_integerList).getCode();

 
    casFeat_second = jcas.getRequiredFeatureDE(casType, "second", "org.apache.uima.serialization.json.test.type.Second", featOkTst);
    casFeatCode_second  = (null == casFeat_second) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_second).getCode();

 
    casFeat_refToSofa = jcas.getRequiredFeatureDE(casType, "refToSofa", "uima.cas.Sofa", featOkTst);
    casFeatCode_refToSofa  = (null == casFeat_refToSofa) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_refToSofa).getCode();

 
    casFeat_docAnnot = jcas.getRequiredFeatureDE(casType, "docAnnot", "uima.tcas.DocumentAnnotation", featOkTst);
    casFeatCode_docAnnot  = (null == casFeat_docAnnot) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_docAnnot).getCode();

  }
}



    