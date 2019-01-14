package com.haiyu.blog.service;

import com.haiyu.blog.po.User;

/**
 * Created by lyq on 2018/2/2.
 */

public interface UserService {
    User checkUser(String username,String password);
}
