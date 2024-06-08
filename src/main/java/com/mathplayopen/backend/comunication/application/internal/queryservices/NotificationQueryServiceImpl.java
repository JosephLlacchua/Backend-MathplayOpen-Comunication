package com.mathplayopen.backend.comunication.application.internal.queryservices;


import com.mathplayopen.backend.comunication.domain.models.aggregates.Notification;
import com.mathplayopen.backend.comunication.domain.services.NotificationQueryService;
import com.mathplayopen.backend.comunication.infrastructure.persistence.jpa.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationQueryServiceImpl implements NotificationQueryService {
    private final NotificationRepository notificationRepository;

    public NotificationQueryServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

    @Override
    public List<Notification> getNotificationsByUserId(Long userId) {
        return notificationRepository.findByUserId(userId);
    }
}
