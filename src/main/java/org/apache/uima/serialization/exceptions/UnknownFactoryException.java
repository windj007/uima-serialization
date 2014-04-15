package org.apache.uima.serialization.exceptions;

public class UnknownFactoryException extends UimaSerializationBaseException {
	private static final long	serialVersionUID	= 5733467251466071400L;

	public UnknownFactoryException() {
		super();
	}

	public UnknownFactoryException(Throwable e) {
		super(e);
	}

	public UnknownFactoryException(String message, Object... args) {
		super(message, args);
	}
}
