package com.security.composite.service;

import com.security.composite.enitty.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDetailsServiceImplTest {

    @Autowired
    UserDetailsServiceImpl service;

    @Before
    public void beforeTest(){
        System.out.println("test service class: started");
    }

    @After
    public void afterTest(){
        System.out.println("test service class: completed");
    }

    /**
     * regular test with before & after & assert
     */
    @Test
    public void testGetUsersList(){
        Set<User> users = service.getUsersList();
        Assert.assertEquals(2, users.size());
    }

    /**
     * test exception
     * @throws SQLException
     */
    @Test //(expected = SQLException.class)
    public void testGetUserByEmail() throws SQLException{
        System.out.println("test GetUserByEmail() started");
        String email = "a@gmail.com";
        User user = service.getUserByEmail(email);
        Assert.assertEquals("USER", user.getRole());
        Assert.assertEquals(1, user.getId());
        System.out.println("test GetUserByEmail() completed");

    }
}
