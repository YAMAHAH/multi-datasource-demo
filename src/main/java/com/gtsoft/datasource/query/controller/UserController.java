package com.gtsoft.datasource.query.controller;

import com.gtsoft.datasource.query.entries.UserEntity;
import com.gtsoft.datasource.query.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/save")
    public UserEntity save() {
        UserEntity user = new UserEntity(2, "Tseng", 21);
        mongoTemplate.save(user);
        return user;
    }

    @GetMapping("/find")
    public List<UserEntity> find() {
        List<UserEntity> userList = mongoTemplate.findAll(UserEntity.class);
        return userList;
    }

    @GetMapping("/findByName")
    public UserEntity findByName(@RequestParam("name") String name) {
        UserEntity user = userService.findByName(name);
        return user;
    }
}
