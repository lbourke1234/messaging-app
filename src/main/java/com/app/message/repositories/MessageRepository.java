package com.app.message.repositories;

import com.app.message.entities.Message;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface MessageRepository extends FirestoreReactiveRepository<Message> {
}
