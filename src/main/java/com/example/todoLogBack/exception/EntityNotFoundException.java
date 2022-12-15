package com.example.todoLogBack.exception;


public class EntityNotFoundException extends RuntimeException {

    private ErrorCodes errorCode;

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public com.example.todoLogBack.exception.ErrorCodes getErrorCode() {
        return errorCode;
    }
}