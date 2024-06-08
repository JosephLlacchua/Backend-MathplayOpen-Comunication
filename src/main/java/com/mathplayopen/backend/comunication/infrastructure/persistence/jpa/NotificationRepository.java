package com.mathplayopen.backend.comunication.infrastructure.persistence.jpa;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserId(Long userId);
}