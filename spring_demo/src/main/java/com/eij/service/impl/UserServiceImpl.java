package com.eij.service.impl;

import com.eij.dao.UserDao;
import com.eij.service.UserService;

/**
 * @author Yanan Lyu
 * @date 3/7/22 9:57 AM
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userService被创建了。");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService ...");
        userDao.add();
    }
}
