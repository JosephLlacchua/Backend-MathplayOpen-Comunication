package com.mathplayopen.backend.comunication.interfaces.rest.transform;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Message;
import com.mathplayopen.backend.comunication.interfaces.rest.resources.MessageResource;

public class MessageResourceFromEntityAssembler {
    public static MessageResource toResourceFromEntity(Message entity){
        return new MessageResource(entity.getId(), entity.getSender().getId(), entity.getReceiver().getId(), entity.getContent(), entity.getCreatedAt(), entity.getUpdatedAt());
    }
}