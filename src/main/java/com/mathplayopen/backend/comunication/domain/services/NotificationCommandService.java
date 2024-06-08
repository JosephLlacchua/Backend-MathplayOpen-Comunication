package com.mathplayopen.backend.comunication.domain.services;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Notification;
import com.mathplayopen.backend.comunication.domain.models.commands.CreateNotificationCommand;

import java.util.Optional;

public interface NotificationCommandService {
    Optional<Notification> handle(CreateNotificationCommand command);
}
