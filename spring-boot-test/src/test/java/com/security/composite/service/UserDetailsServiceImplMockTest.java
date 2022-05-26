package com.security.composite.service;

import com.security.composite.enitty.User;
import com.security.composite.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.when;

/**
 * @RunWith(MokitoJUnitRunner.class) work with @Mock & @InjectedMocks - not working with spring @autowired
 * @RunWith(SpringRunner.class) work with @MockBean, @Autowired - not working with Mockito @InjectedMocks
 */
//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDetailsServiceImplMockTest {

    //@Mock
    @MockBean
    UserRepository repository;

    @MockBean
    RestTemplate restTemplate;

    //@InjectMocks
    @Autowired
    UserDetailsServiceImpl service;

    //Mockito - for database test
    @Test
    public void testGetUserById(){
        System.out.println("mockito test GetUserById() started");
        int id = 3;
        User mockUser = new User(3, "mock@test.com", "mocktest", "NA");
        when(repository.getUserById(id)).thenReturn(mockUser);
        User user = service.getUserById(id);
        Assert.assertEquals("mock@test.com", user.getEmail());
        System.out.println("mockito test GetUserById() completed");
    }

    //Mockito - for RestTemplate
    @Test
    public void testGetRemoteUserInfo(){
        System.out.println("mockito test GetRemoteUserInfo() started");
        int id = 3;
        User mockUser = new User(3, "mock@test.com", "mocktest", "NA");

        String url = "http://localhost:2020/customer-service/customer/" + id;
        when(restTemplate.getForObject(url, User.class)).thenReturn(mockUser);

        User user = service.getRemoteUserInfo(id);
        Assert.assertEquals("mock@test.com", user.getEmail());

        System.out.println("mockito test GetRemoteUserInfo() completed");
    }
}
