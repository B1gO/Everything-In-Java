package com.eij.framework.beans.factory.xml;

import com.eij.framework.beans.BeanDefinition;
import com.eij.framework.beans.MutablePropertyValues;
import com.eij.framework.beans.PropertyValue;
import com.eij.framework.beans.factory.support.BeanDefinitionReader;
import com.eij.framework.beans.factory.support.BeanDefinitionRegistry;
import com.eij.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author Yanan Lyu
 * @date 3/8/22 9:07 AM
 * @description 针对xml配置文件进行解析的类
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    /**
     * 声明注册表对象
     */
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j对xml进行解析
        SAXReader reader = new SAXReader();
        // 获取类路径下的配置文件
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);

        Element rootElement = document.getRootElement();
        List<Element> beanElements = rootElement.elements("bean");

        for (Element beanElement : beanElements) {
            // 获取ID属性
            String id = beanElement.attributeValue("id");
            // 获取class属性
            String className = beanElement.attributeValue("class");

            // 将id属性和class属性封装到beanDefinition中
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            // 创建mutalblePropertyValue
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();

            // 获取bean标签下所有property标签对象
            List<Element> propertyElements = beanElement.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }

            // 将mutablePropertyValue对象封装到BeanDefinition对象中
            beanDefinition.setPropertyValues(mutablePropertyValues);

            // 将beanDefinition对象注册到注册表中
            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
