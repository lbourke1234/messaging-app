package com.app.message.repositories;

import com.app.message.entities.User;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface UserRepository extends FirestoreReactiveRepository<User> {
}
