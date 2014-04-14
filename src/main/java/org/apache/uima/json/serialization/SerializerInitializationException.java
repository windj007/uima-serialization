package org.apache.uima.json.serialization;

import org.apache.uima.UIMAException;

public class SerializerInitializationException extends UIMAException {
	private static final long	serialVersionUID	= 9093231364143309360L;
	
	public SerializerInitializationException() {
		super();
	}
	
	public SerializerInitializationException(Throwable e) {
		super(e);
	}
}
