package com.indieLance.indieLanceServerSide.graphQLQueries.exceptions;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MessageNotFoundException extends RuntimeException implements GraphQLError {

    private Long messageId;

    public MessageNotFoundException(Long messageId) {
        this.messageId = messageId;
    }

    @Override
    public String getMessage() {
        return "Message with ID " + messageId + " could not be found";
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
        return Collections.singletonMap("messageId", messageId);
    }
}