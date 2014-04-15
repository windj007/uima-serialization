package org.apache.uima.serialization;

import org.apache.uima.serialization.exceptions.SerializerInitializationException;

public interface ICasSerializerFactory {
	ICasSerializer createSerializer() throws SerializerInitializationException;
}
