package com.eij.controller;

import com.eij.framework.context.ApplicationContext;
import com.eij.framework.context.support.ClassPathXmlApplicationContext;
import com.eij.service.UserService;

/**
 * @author Yanan Lyu
 * @date 3/7/22 9:59 AM
 */
public class UserController {
    public static void main(String[] args) throws Exception {

        /**
         * 方案1： ApplicationContext，eager load
         */
        // 1, 创建spring 的容器对象
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2， 从容器对象中获取userService 对象
         UserService userService = applicationContext.getBean("userService", UserService.class);

        /**
         * 方案2： beanFactory， lazy load
         */
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        UserService userService = beanFactory.getBean("userService", UserService.class);


        // 3，调用userService方法进行逻辑处理
        userService.add();
    }
}
