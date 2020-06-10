package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private static final String TOPIC = "TopicOne";

    private static final String MESSAGE = "Users were updated!";

    private final UserRepo userRepo;

    private KafkaTemplate<String, String> kafkaTemplate;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public List<User> saveAll(List<User> users){
        kafkaTemplate.send(TOPIC, MESSAGE);
        return userRepo.saveAll(users);
    }
}
