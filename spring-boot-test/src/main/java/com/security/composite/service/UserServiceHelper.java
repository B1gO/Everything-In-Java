package com.security.composite.service;

import com.security.composite.enitty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserServiceHelper {

    @Autowired
    RestTemplate restTemplate;

    public User getUser(int id) {
        String url = "http://localhost:2020/customer-service/customer/" + id;
        User user = this.restTemplate.getForObject(url, User.class);
        return user;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
