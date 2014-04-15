package org.apache.uima.serialization.json;

import org.apache.uima.serialization.ICasSerializer;
import org.apache.uima.serialization.ICasSerializerFactory;
import org.apache.uima.serialization.exceptions.SerializerInitializationException;

public class CasJsonSerializerFactory implements ICasSerializerFactory {

	private ITransformBuilder transformBuilder = TransformBuilderFactory.getDefaultTransformBuilder();
	
	public synchronized void setTransformBuilder(ITransformBuilder builder) {
		transformBuilder = builder;
	}
	
	public synchronized ITransformBuilder getTransformBuilder() {
		return transformBuilder;
	}

	public synchronized ICasSerializer createSerializer()
		throws SerializerInitializationException {
		return new CasJsonSerializer(transformBuilder);
	}
}
