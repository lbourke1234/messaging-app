package com.app.message.services;

import com.app.message.entities.Message;
import com.app.message.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository MessageRepository) {
        this.messageRepository = MessageRepository;
    }

    public Mono<Message> createMessage(Message message) {
        return messageRepository.save(message);
    }

    public Mono<Message> getMessageById(String id) {
        return messageRepository.findById(id);
    }
}
