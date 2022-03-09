package com.eij.dao.impl;

import com.eij.dao.UserDao;

/**
 * @author Yanan Lyu
 * @date 3/7/22 9:55 AM
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl() {
        System.out.println("userDao被创建了");
    }

    @Override
    public void add() {
        System.out.println("UserDao ..." + username + "==" + password);
    }
}
