package com.eij.dao.impl;

import com.eij.dao.UserDao;

/**
 * @author Yanan Lyu
 * @date 3/7/22 9:55 AM
 */
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("userDao被创建了");
    }

    @Override
    public void add() {
        System.out.println("UserDao ...");
    }
}
