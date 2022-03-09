package com.eij.framework.beans.factory.support;

import com.eij.framework.beans.BeanDefinition;

/**
 * @author Yanan Lyu
 * @date 3/8/22 8:59 AM
 */
public interface BeanDefinitionRegistry {
    /**
     * @description 注册BeanDefinition对象到注册表中
     * @param beanName bean的名字，
     * @param beanDefinition bean的对象
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * @description 从注册表中删除指定名称的BeanDefinition对象
     * @param beanName
     * @throws Exception
     */
    void removeBeanDefinition(String beanName) throws Exception;

    /**
     * @description 根据名称从注册表中名字取BeanDefinition对象
     * @param beanName
     * @return
     * @throws Exception
     */
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
