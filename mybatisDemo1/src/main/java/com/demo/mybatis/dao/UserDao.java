package com.demo.mybatis.dao;

import com.demo.mybatis.pojo.User;

import java.util.List;

/**
 * @author ljrstart
 * @create 2020-10-16-10:38
 */
public interface UserDao {

    List<User> getUserList();
}
