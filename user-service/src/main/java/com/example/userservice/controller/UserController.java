package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<List<User>> saveNewUsers(
            @RequestBody List<User> users) {
        return ResponseEntity.ok(userService.saveAll(users));
    }

    @PutMapping
    public ResponseEntity<List<User>> saveUsers(
            @RequestBody List<User> users) {
        return ResponseEntity.ok(userService.saveAll(users));
    }
}