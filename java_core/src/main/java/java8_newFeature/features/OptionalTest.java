package java8_newFeature.features;

import org.junit.Test;
import java8_newFeature.pojos.Employee;

import java.util.Optional;

/**
 * @author Yanan Lyu
 * @date 7/8/21 4:41 PM
 */
public class OptionalTest {

    /**
     * https://www.youtube.com/watch?v=wOi2k4dJviM&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=684
     * of(T t) - 不可以为null
     * ofNullable(T t) - 可以为null
     * orElse(T t) - 如果当前的optional内部封装的t是非空的，则返回内部t, 如果内部的t是空的， 则返回orElse()方法中的t
     */
    @Test
    public void test1() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void test2() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);
    }
}
