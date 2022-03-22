package java8_newFeature.utils;

import java8_newFeature.pojos.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yanan Lyu
 * @date 7/7/21 12:46 PM
 */
public class EmployeeData {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1001, "马云"));
        list.add(new Employee(1002, "马化腾"));
        list.add(new Employee(1004, "雷军"));
        list.add(new Employee(1005, "比尔盖茨"));
        list.add(new Employee(1003, "李彦宏"));
        list.add(new Employee(1007, "任正非"));
        list.add(new Employee(1006, "扎克伯格"));

        return list;
    }
}
