package com.Elibrary.Exception;

public class ISBNDoesNotExistsException extends Exception{
    String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public  ISBNDoesNotExistsException(String s) {
        this.errorMessage = s;
    }
}
