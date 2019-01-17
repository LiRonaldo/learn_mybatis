package com.yuxiang.li.dao;

import com.yuxiang.li.entity.User;

import java.util.List;

/**
 * Created by yuxiang.li on 2018/12/6.
 */
public interface UserDao {
    public int insertUser(User user);

    public List<User> findUserById(String name);

    public List<User> findAllUsers();

}
