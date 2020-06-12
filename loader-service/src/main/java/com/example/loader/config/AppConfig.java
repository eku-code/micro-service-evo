package com.example.loader.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${mongo.db.url}")
    private String mongoDBUrl;

    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create(mongoDBUrl);
    }
}