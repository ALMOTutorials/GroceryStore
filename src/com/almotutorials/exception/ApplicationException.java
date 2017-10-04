package com.almotutorials.exception;

public class ApplicationException extends Exception {

    private String errorMessage;
    private Throwable exception;

    public ApplicationException() {
        super();
    }

    public ApplicationException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public ApplicationException(String errorMessage, Throwable t) {
        super(errorMessage, t);
        this.errorMessage = errorMessage;
        this.exception = t;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Throwable getException() {
        return exception;
    }
}
