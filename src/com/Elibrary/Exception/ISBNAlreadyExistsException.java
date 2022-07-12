package com.Elibrary.Exception;

public class ISBNAlreadyExistsException extends Exception{
    String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public  ISBNAlreadyExistsException(String s) {
        this.errorMessage = s;
    }
}
