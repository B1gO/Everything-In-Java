package com.eij.framework.beans.factory.support;

/**
 * @author Yanan Lyu
 * @date 3/8/22 9:06 AM
 * @description 用来解析配置文件的，而该接口只是定义了规范
 */
public interface BeanDefinitionReader {
    /**
     * @return BeanDefinitionRegistry
     * @description 获取注册表对象
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * @description 加载配置文件并在注册表中进行注册
     * @param configLocation 配置文件位置
     * @throws Exception
     */
    void loadBeanDefinitions(String configLocation) throws Exception;
}
