package design_pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yanan Lyu
 * @date 2/25/22 10:53 AM
 * @description 环境类
 */
public class Context {
    /**
     * 定义一个map集合，用来存储变量以及对应的值
     */
    private Map<Variable, Integer> map = new HashMap<>();

    /**
     * 添加变量的功能
     * @param var variable
     * @param value value
     */
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    /**
     * 根据变量获得对应的值
     * @param var 变量名
     * @return 获得对应的值
     */
    public int getValue(Variable var) {
        return map.get(var);
    }
}
