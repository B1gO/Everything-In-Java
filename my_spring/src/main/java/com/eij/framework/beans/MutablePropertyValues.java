package com.eij.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Yanan Lyu
 * @date 3/8/22 8:41 AM
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    // 获取所有的propertyValue对象，返回数组形式
    public PropertyValue[] getPropertyValues() {
        // 将集合转换为数组并返回
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    // 根据name 属性值获取propertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        // 遍历集合对象
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }

        return null;
    }

    // 判断集合是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    // 添加propertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        // 判断叽盒子红存储的propertyValue对象是否和传递的重复了，如果重复，就覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currentPv = propertyValueList.get(i);
            if (currentPv.getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue);
                return this;
            }
        }
        this.propertyValueList.add(propertyValue);
        return this;
    }

    // 判断是否有指定name属性值的对象
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
