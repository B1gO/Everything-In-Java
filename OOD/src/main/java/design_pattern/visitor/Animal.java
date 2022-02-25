package design_pattern.visitor;

/**
 * @author Yanan Lyu
 * @date 2/25/22 8:29 AM
 * @description 抽象元素角色类
 */
public interface Animal {
    // 接受访问者访问的功能
    void accept(Person person);
}
