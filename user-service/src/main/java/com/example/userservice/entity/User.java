package com.example.userservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@Data
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_text")
    private String userText;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    @Column(name = "picture")
    private String picture;
}