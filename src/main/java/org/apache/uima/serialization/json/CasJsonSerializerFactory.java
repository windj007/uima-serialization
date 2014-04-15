package org.apache.uima.serialization.json;

import org.apache.uima.serialization.ICasSerializer;
import org.apache.uima.serialization.ICasSerializerFactory;
import org.apache.uima.serialization.exceptions.SerializerInitializationException;

public class CasJsonSerializerFactory implements ICasSerializerFactory {

	private ITransformBuilder	transformBuilder	= null;

	public CasJsonSerializerFactory() {
		this(TransformBuilderFactory.getDefaultTransformBuilder());
	}

	public CasJsonSerializerFactory(ITransformBuilder builder) {
		this.transformBuilder = builder;
	}

	public synchronized ICasSerializer createSerializer()
		throws SerializerInitializationException {
		return new CasJsonSerializer(transformBuilder);
	}
}
