package com.indieLance.indieLanceServerSide.graphQLQueries.exceptions;

import com.indieLance.indieLanceServerSide.entities.User;

public class UserNotFoundException extends User {

    private String errorMessage;

    public UserNotFoundException(String s) {
        errorMessage = s;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
