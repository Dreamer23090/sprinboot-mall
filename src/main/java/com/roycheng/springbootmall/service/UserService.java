package com.roycheng.springbootmall.service;

import com.roycheng.springbootmall.dto.UserRegisterRequest;
import com.roycheng.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
