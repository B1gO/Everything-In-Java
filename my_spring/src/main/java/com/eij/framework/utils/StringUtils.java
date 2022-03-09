package com.eij.framework.utils;

/**
 * @author Yanan Lyu
 * @date 3/8/22 10:03 PM
 */
public class StringUtils {
    private StringUtils() {
    }

    /**
     * userDao  ==> setUserDao
     * @param fieldName
     * @return
     */
    public static String getSetterMethodByFieldName(String fieldName) {
        String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        return methodName;
    }
}
