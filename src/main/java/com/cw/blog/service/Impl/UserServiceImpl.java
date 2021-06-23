package com.cw.blog.service.Impl;

import com.cw.blog.eneity.User;
import com.cw.blog.mapper.UserMapper;
import com.cw.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        return userMapper.findUserAndPassword(username,password);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
