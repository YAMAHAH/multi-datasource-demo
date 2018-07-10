package com.gtsoft.datasource.query.service;

import com.gtsoft.datasource.query.entries.UserEntity;

public interface UserService {
    void save(UserEntity user);

    UserEntity findByName(String name);
}
