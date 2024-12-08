package com.app.message.entities;

import com.google.cloud.spring.data.firestore.Document;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Document(collectionName = "messages")
public class Message {

    @Id
    private String id;
    private String senderId;
    private String conversationId;
    private String text;
    private Long timestamp;

}
