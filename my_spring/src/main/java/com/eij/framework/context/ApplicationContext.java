package com.eij.framework.context;

import com.eij.framework.beans.factory.BeanFactory;

/**
 * @author Yanan Lyu
 * @date 3/8/22 9:46 AM
 * @description 定义非延时功能
 */
public interface ApplicationContext extends BeanFactory {
    void refresh() throws Exception;
}
