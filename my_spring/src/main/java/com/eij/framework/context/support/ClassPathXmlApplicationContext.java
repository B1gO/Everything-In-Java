package com.eij.framework.context.support;

import com.eij.framework.beans.BeanDefinition;
import com.eij.framework.beans.MutablePropertyValues;
import com.eij.framework.beans.PropertyValue;
import com.eij.framework.beans.factory.support.BeanDefinitionRegistry;
import com.eij.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.eij.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @author Yanan Lyu
 * @date 3/8/22 5:24 PM
 * @description IOC容器具体的子实现类
 * 用于加载类路径下的xml格式的配置文件
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        // 构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {

        }
    }

    /**
     * 根据bean对象的名称获取bean对象
     *
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public Object getBean(String name) throws Exception {
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        if (beanDefinition == null) {
            return null;
        }
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if (ref != null && !"".equals(ref)) {
                Object bean = getBean(ref);
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(methodName)) {
                        method.invoke(beanObj, bean);
                    }
                }
            }
            if (value != null && !"".equals(value)) {
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj, value);
            }
        }
        singletonObjects.put(name, beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean != null) {
            return clazz.cast(bean);
        }
        return null;
    }
}
