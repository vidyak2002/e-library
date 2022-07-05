package com.Training.Exception;

public class CustomException extends Exception{
    String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public  CustomException(String s) {
        this.errorMessage = s;
    }

}
