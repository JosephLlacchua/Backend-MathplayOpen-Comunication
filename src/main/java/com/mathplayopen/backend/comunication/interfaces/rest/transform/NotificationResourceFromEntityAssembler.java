package com.mathplayopen.backend.comunication.interfaces.rest.transform;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Notification;
import com.mathplayopen.backend.comunication.interfaces.rest.resources.NotificationResource;

public class NotificationResourceFromEntityAssembler {
    public static NotificationResource toResourceFromEntity(Notification entity){
        return new NotificationResource(entity.getId(), entity.getUser().getId(), entity.getMessage(), entity.getCreatedAt(), entity.getUpdatedAt(), entity.isRead());
    }
}