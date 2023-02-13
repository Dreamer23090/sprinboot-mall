package com.roycheng.springbootmall.dao;

import com.roycheng.springbootmall.dto.UserRegisterRequest;
import com.roycheng.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
