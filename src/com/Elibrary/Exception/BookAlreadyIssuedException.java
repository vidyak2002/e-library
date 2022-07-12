package com.Elibrary.Exception;

public class BookAlreadyIssuedException extends Exception {
    String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public  BookAlreadyIssuedException(String s) {
        this.errorMessage = s;
    }
}
