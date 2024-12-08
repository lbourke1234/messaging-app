package com.app.message.repositories;

import com.app.message.entities.Message;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends FirestoreReactiveRepository<Message> {
}
