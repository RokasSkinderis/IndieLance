package com.indieLance.indieLanceServerSide.graphQLQueries.exceptions;

import com.indieLance.indieLanceServerSide.entities.User;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UserNotFoundException extends RuntimeException implements GraphQLError {

    private Long userId;

    public UserNotFoundException(Long userId) {
        this.userId = userId;
    }

    @Override
    public String getMessage() {
        return "User with ID " + userId + " could not be found";
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.ValidationError;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Collections.singletonMap("userId", userId);
    }
}