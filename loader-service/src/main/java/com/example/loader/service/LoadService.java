package com.example.loader.service;

import com.example.loader.feign.PostApiClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LoadService {

    @Value("${mongo.db.name}")
    private String mongoDBName;

    @Autowired
    private PostApiClient postApiClient;

    @KafkaListener(topics = "TopicOne", groupId = "group_id")
    public void loadPosts() {
        System.out.println("Here we are >>>>>>>> Inside loadPosts");
        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), mongoDBName);
        mongoOps.insertAll(postApiClient.getPosts());
    }
}
