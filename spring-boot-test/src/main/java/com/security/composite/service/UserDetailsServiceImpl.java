package com.security.composite.service;

import com.security.composite.enitty.User;
import com.security.composite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Set;

@Service
public class UserDetailsServiceImpl{

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserServiceHelper helper;

    //register new user
    public void saveUser(User u){
        //u.setPassword(passwordEncoder.encode(u.getPassword()));
        userRepository.saveUser(u);
    }

    public boolean validateUserPlain(User user) {
        return userRepository.validateUserPlain(user);
    }

    public User getUserByEmail(String email) throws SQLException{
        User user = userRepository.getUserByEmail(email);
        if(user == null){
            throw new SQLException("cannot find user");
        }
        return user;
    }

    public Set<User> getUsersList(){
        return userRepository.getUsers();
    }

    public User getUserById(int id){
        return userRepository.getUserById(id);
    }

    //call rest template
    public User getRemoteUserInfo(int id){
        User user = helper.getUser(id);
        if(user.getId() != -1){
            return user;
        }
        return null;
    }
}
