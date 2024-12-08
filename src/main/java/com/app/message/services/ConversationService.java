package com.app.message.services;

import com.app.message.entities.Conversation;
import com.app.message.repositories.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ConversationService {

    private final ConversationRepository conversationRepository;

    @Autowired
    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    public Mono<Conversation> createConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }

    public Mono<Conversation> getConversationById(String id) {
        return conversationRepository.findById(id);
    }

}
