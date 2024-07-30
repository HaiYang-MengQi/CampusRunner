package com.haiyang.campusrunner.controller;

import com.haiyang.campusrunner.pojo.Result;
import com.haiyang.campusrunner.pojo.User;
import com.haiyang.campusrunner.service.UserService;
import com.haiyang.campusrunner.utils.BCryptUtils;
import com.haiyang.campusrunner.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
@PostMapping("/login")
    public Result<String> login(@RequestBody Map<String, String> map)
    {
        User u = userService.getUserByUsername(map.get("username"));
        if (u == null){
           return Result.error("用户名不存在");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(map.get("password"),u.getPassword())){
            return Result.success(JWTUtils.generateToken(u.getId(),u.getUsername()));
        }else {
            return Result.error("密码错误");
        }
    }
@PutMapping("/register")
    public Result<String> register(@RequestBody @Validated User user){
        user.setPassword(BCryptUtils.encrypt(user.getPassword()));
        userService.addUser(user);
        return Result.success("新增用户成功!");
    }
}
