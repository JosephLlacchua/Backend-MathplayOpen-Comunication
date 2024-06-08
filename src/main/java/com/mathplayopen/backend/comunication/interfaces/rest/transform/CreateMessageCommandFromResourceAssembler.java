package com.mathplayopen.backend.comunication.interfaces.rest.transform;

import com.mathplayopen.backend.comunication.domain.models.commands.CreateMessageCommand;
import com.mathplayopen.backend.comunication.interfaces.rest.resources.CreateMessageResource;

public class CreateMessageCommandFromResourceAssembler {
    public static CreateMessageCommand toCommandFromResource(CreateMessageResource resource)
    {
        return new CreateMessageCommand(resource.senderId(), resource.receiverId(), resource.content());
    }
}