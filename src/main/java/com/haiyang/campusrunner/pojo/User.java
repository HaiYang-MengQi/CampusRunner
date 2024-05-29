package com.haiyang.campusrunner.pojo;

import com.haiyang.campusrunner.anno.PhoneNumber;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String sex;
    @PhoneNumber
    private String phone;
    private String address;
    public interface defaultGroup{}
    public interface Login{}
}
