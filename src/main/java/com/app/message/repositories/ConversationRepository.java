package com.app.message.repositories;

import com.app.message.entities.Conversation;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends FirestoreReactiveRepository<Conversation> {
}
