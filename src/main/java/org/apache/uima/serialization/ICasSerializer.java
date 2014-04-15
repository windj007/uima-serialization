package org.apache.uima.serialization;

import org.apache.uima.cas.CAS;
import org.apache.uima.serialization.exceptions.CasSerializationException;

public interface ICasSerializer {
	String serialize(CAS doc) throws CasSerializationException;

	void deserialize(CAS doc, String src) throws CasSerializationException;
}
