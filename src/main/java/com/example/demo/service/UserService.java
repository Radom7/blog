package com.example.demo.service;

import com.example.demo.po.User;

/**
 * Created by lyq on 2018/2/2.
 */

public interface UserService {
    User checkUser(String username,String password);
}
