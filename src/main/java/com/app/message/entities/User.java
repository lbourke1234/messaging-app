package com.app.message.entities;

import com.google.cloud.spring.data.firestore.Document;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Document(collectionName = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String profilePicture;
    private String status;
    private Long createdAt;

}
