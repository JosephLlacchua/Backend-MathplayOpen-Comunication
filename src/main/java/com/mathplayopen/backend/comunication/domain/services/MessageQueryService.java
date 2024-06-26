package com.mathplayopen.backend.comunication.domain.services;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Message;

import java.util.List;
import java.util.Optional;

public interface MessageQueryService {
    Optional<Message> getMessageById(Long id);
    List<Message> getMessagesBySenderId(Long senderId);
    List<Message> getMessagesByReceiverId(Long receiverId);
    List<Message> getMessagesBetweenUsers(Long senderId, Long receiverId);
}