package com.haiyang.campusrunner.dao;

import com.haiyang.campusrunner.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByUsername(String username);
    void addUser(User user);
}
