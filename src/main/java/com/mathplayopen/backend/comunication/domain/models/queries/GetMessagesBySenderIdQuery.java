package com.mathplayopen.backend.comunication.domain.models.queries;

public record GetMessagesBySenderIdQuery(Long senderId) {
    public GetMessagesBySenderIdQuery {
        if (senderId == null) {
            throw new IllegalArgumentException("senderId cannot be null");
        }
    }
}