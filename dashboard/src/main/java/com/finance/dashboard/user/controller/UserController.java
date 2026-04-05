package com.finance.dashboard.user.controller;

import com.finance.dashboard.user.entity.UserEntity;
import com.finance.dashboard.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        return service.create(user);
    }

    @GetMapping
    public List<UserEntity> getAll() {
        return service.getAll();
    }
}