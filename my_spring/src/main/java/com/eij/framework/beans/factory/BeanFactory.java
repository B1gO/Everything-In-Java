package com.eij.framework.beans.factory;

/**
 * @author Yanan Lyu
 * @date 3/8/22 9:44 AM
 * @description IOC容器父接口
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
