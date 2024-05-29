package com.haiyang.campusrunner.service.impl;

import com.haiyang.campusrunner.dao.UserMapper;
import com.haiyang.campusrunner.pojo.User;
import com.haiyang.campusrunner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
