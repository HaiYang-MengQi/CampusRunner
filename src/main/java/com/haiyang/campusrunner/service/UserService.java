package com.haiyang.campusrunner.service;

import com.haiyang.campusrunner.pojo.User;

public interface UserService {
    User getUserByUsername(String username);
    void addUser(User user);
}
