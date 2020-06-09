package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public List<User> saveAll(List<User> users){
        return userRepo.saveAll(users);
    }
}
