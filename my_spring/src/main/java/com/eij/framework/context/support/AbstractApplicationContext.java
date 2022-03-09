package com.eij.framework.context.support;

import com.eij.framework.beans.BeanDefinition;
import com.eij.framework.beans.factory.support.BeanDefinitionReader;
import com.eij.framework.beans.factory.support.BeanDefinitionRegistry;
import com.eij.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yanan Lyu
 * @date 3/8/22 5:15 PM
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    // 声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    // 定义用于存储bean对象的map容器
    protected Map<String, Object> singletonObjects = new HashMap<>();

    // 声明配置文件类路径
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        // 加载BeanDefinition 对象
        beanDefinitionReader.loadBeanDefinitions((configLocation));
        // 初始化bean
        finishBeanInitialization();
    }

    /**
     * bean的初始化
     * @throws Exception
     */
    private void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        // 获取beanDefinition对象
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(name);
            getBean(name);
        }
    }
}
