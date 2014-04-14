package org.apache.uima.json.serialization;

import org.apache.uima.UIMAException;

public class CasJsonSerializationException extends UIMAException {
	private static final long	serialVersionUID	= 3780189437291589687L;
	
	public CasJsonSerializationException() {
		super();
	}
	
	public CasJsonSerializationException(Throwable e) {
		super(e);
	}
}
