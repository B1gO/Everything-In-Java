package com.eij.framework.beans.factory.support;

import com.eij.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yanan Lyu
 * @date 3/8/22 9:00 AM
 * @description 注册表的子实现类
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {

    /**
     * 定义一个容器，用来存储BeanDefinition对象
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
