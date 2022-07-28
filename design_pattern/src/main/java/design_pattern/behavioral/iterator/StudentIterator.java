package design_pattern.behavioral.iterator;

/**
 * @author Yanan Lyu
 * @date 2/24/22 9:40 PM
 * @description 抽象迭代器角色接口
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
