package com.eij.framework.beans.factory.support;

import com.eij.framework.beans.BeanDefinition;

/**
 * @author Yanan Lyu
 * @date 3/8/22 8:59 AM
 */
public interface BeanDefinitionRegistry {
    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition
            beanDefinition);
    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;
    //根据名称从注册表中 取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;
    boolean containsBeanDefinition(String beanName);
    int getBeanDefinitionCount();
    String[] getBeanDefinitionNames();
}