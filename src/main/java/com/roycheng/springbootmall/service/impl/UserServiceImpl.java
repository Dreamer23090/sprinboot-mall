package com.roycheng.springbootmall.service.impl;

import com.roycheng.springbootmall.dao.UserDao;
import com.roycheng.springbootmall.dto.UserRegisterRequest;
import com.roycheng.springbootmall.model.User;
import com.roycheng.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
