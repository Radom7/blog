package com.haiyu.blog.dao;

import com.haiyu.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lyq on 2018/2/2.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);

}
