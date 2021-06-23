package com.cw.blog.service;

import com.cw.blog.eneity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User checkUser(String username , String password);
    User getUserById(int id);
}
