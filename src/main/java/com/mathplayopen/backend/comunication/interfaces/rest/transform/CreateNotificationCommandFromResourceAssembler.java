package com.mathplayopen.backend.comunication.interfaces.rest.transform;

import com.mathplayopen.backend.comunication.domain.models.commands.CreateNotificationCommand;
import com.mathplayopen.backend.comunication.interfaces.rest.resources.CreateNotificationResource;

public class CreateNotificationCommandFromResourceAssembler {
    public static CreateNotificationCommand toCommandFromResource(CreateNotificationResource resource){
        return new CreateNotificationCommand(resource.userId(), resource.message());
    }
}