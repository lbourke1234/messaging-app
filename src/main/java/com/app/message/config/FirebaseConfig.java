package com.app.message.config;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
public class FirebaseConfig {

    @Bean
    public Firestore firestoreClient() throws IOException {
        // Path to your Firebase Admin SDK private key JSON file
        FileInputStream serviceAccount =
                new FileInputStream("path/to/your/firebase/serviceAccountKey.json");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(com.google.auth.oauth2.GoogleCredentials.fromStream(serviceAccount))
                .setProjectId("your-firebase-project-id")
                .build();


        FirebaseApp.initializeApp(options);
        return FirestoreClient.getFirestore();
    }
}
