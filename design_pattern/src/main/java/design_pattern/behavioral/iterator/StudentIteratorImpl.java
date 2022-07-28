package design_pattern.behavioral.iterator;

import java.util.List;

/**
 * @author Yanan Lyu
 * @date 2/24/22 9:41 PM
 * @description 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;   // 用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
