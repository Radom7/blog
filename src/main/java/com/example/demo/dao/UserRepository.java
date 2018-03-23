package com.example.demo.dao;

import com.example.demo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lyq on 2018/2/2.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);

}
