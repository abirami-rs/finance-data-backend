package com.finance.dashboard.user.service;

import com.finance.dashboard.user.entity.UserEntity;
import com.finance.dashboard.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public UserEntity create(UserEntity user) {
        return repo.save(user);
    }

    public List<UserEntity> getAll() {
        return repo.findAll();
    }
}