package com.pakis.cms.shared.exceptions;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PakiNotFoundException extends Exception implements Serializable{
    private String errorMessage;

    public PakiNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

	public PakiNotFoundException() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

   
}