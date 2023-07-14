package com.vasyancoder.HackProd.exception;

public class ApiException extends RuntimeException {

    protected String errorCode;

    public ApiException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
