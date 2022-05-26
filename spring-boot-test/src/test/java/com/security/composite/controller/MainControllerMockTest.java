package com.security.composite.controller;

import com.security.composite.enitty.User;
import com.security.composite.service.UserDetailsServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    MainController controller;

    @MockBean
    UserDetailsServiceImpl service;

    //Mockito
    @Test
    public void testRegisterUserMockito(){

        System.out.println("mockito test registerUser started");

        User mockUser = new User(3, "mock@test.com", "mocktest", "NA");
        doNothing().when(service).saveUser(mockUser); //doNothing is for void method
        String pageName = controller.registerUser(mockUser);
        Assert.assertEquals("loginPage", pageName);

        System.out.println("mockito test registerUser completed");
    }

    //MockMvc
    @Test
    public void testRegisterUserMockMVC() throws Exception{

        System.out.println("MockMVC test registerUser started");

        User mockUser = new User(3, "mock@test.com", "mocktest", "NA");
        doNothing().when(service).saveUser(mockUser); //doNothing is for void method

        mockMvc.perform(
                    MockMvcRequestBuilders
                        .post("/register")
                        .flashAttr("user", mockUser)  //for modelAttribute
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                ).andExpect(status().isOk()) //redirect code : 302
                .andExpect(MockMvcResultMatchers.view().name("loginPage"));

        System.out.println("MockMVC test registerUser completed");
    }


    //MockMVC
    @Test
    public void testRegularLogin() throws Exception{
        User mockUser = new User(3, "mock@test.com", "mocktest", "NA");

        when(service.validateUserPlain(mockUser)).thenReturn(true);

        mockMvc.perform(
                    MockMvcRequestBuilders
                    .post("/regular_login")
                    .flashAttr("user", mockUser)  //for modelAttribute
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                ).andExpect(status().is3xxRedirection()) //redirect code : 302
                .andExpect(MockMvcResultMatchers.redirectedUrl("/userInfo"));

    }

}
