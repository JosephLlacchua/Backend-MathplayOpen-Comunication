package com.mathplayopen.backend.comunication.domain.services;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationQueryService {
    Optional<Notification> getNotificationById(Long id);
    List<Notification> getNotificationsByUserId(Long userId);
}
