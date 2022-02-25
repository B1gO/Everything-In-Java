package design_pattern.iterator;

/**
 * @author Yanan Lyu
 * @date 2/24/22 9:44 PM
 */
public interface StudentAggregate {

    // 添加学生功能
    void addStudent(Student stu);

    // 删除学生功能
    void removeStudent(Student stu);

    // 获取迭代器对象功能
    StudentIterator getStudentIterator();
}
