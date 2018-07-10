package com.gtsoft.datasource.query.service;

import com.gtsoft.datasource.query.entries.UserEntity;
import com.gtsoft.datasource.query.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserEntity user) {
        userRepository.save(user);
    }
    @Override
    public UserEntity findByName(String name) {
        return this.userRepository.findByName(name);
    }
}
