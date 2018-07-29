package com.github.vincentrussell.json.datagenerator;

public class JsonDataGeneratorException extends Exception {
	private static final long serialVersionUID = 1L;

	public JsonDataGeneratorException() {
        super();
    }

    public JsonDataGeneratorException(String message) {
        super(message);
    }

    public JsonDataGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonDataGeneratorException(Throwable cause) {
        super(cause);
    }

    protected JsonDataGeneratorException(String message, Throwable cause,
                                         boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
