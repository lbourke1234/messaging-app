package com.app.message.entities;

import com.google.cloud.spring.data.firestore.Document;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@Document(collectionName = "conversations")
public class Conversation {

    @Id
    private String id;
    private List<String> participantIds;
    private String lastMessage;
    private Long lastUpdated;

}
