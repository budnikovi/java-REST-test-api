package com.example.javaresttestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Service
@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "get user";
    }

    @PostMapping
    public Users createUser() {
        Users users = userService.createUserService();
        return users;
    }

    @PutMapping
    public String updateUser() {
        return "update user";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user";
    }
}
