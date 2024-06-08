package com.mathplayopen.backend.comunication.domain.services;

import com.mathplayopen.backend.comunication.domain.models.aggregates.Message;
import com.mathplayopen.backend.comunication.domain.models.commands.CreateMessageCommand;

import java.util.Optional;

public interface MessageCommandService {
    Optional<Message> handle(CreateMessageCommand command);
}