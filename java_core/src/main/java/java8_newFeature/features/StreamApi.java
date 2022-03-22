package java8_newFeature.features;

import org.junit.Test;
import java8_newFeature.pojos.Employee;
import java8_newFeature.utils.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Collections 讲的是数据，Stream讲的是计算（CPU）
 * 1. Stream 自己不会存储元素
 * 2. Stream 不会改变源对象，相反，他们会返回一个持有结果的新stream
 * 3. Stream操作是延迟执行的，这意味着他们会等到需要结果的时候才执行。
 * Stream执行流程：
 * 1. 创建Stream： 获取一个数据源
 * 2. 中间操作： 一个操作链： 对数据进行处理
 * 3. 终止操作： 一旦执行中止操作，则会开始执行中间操作链，并产生结果。之后，不会再被使用。
 *
 * @author Yanan Lyu
 * @date 6/29/21 10:16 AM
 */
public class StreamApi {

    /**
     * 创建Stream的方式
     * 1. 通过集合
     * 2. 通过数组Arrays
     * 3. 通过Stream的Of()
     * 4. 创建无限流
     */

    @Test
    public void testCollection() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        col.forEach(System.out::println);
        // 返回一个顺序流
        Stream<Integer> stream = col.stream();
        // 返回一个并行流
        Stream<Integer> parallelStream = col.parallelStream();
    }

    @Test
    public void testArrays() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee(1001, "tom");
        Employee e2 = new Employee(1002, "Jerry");
        Employee[] arr1 = new Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
    }

    @Test
    public void testOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }

    @Test
    public void testIterateGenerate() {
        // 遍历前10个偶数
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

    /**
     * 创建Stream的中间操作
     * <p>
     * 一，筛选
     * 1. filter(Predicate p) - 接受lambda, 从流中排出某些元素
     * 2. limit(n) - 截断流，使其元素不超过给定的数量
     * 3. skip(n) - 跳过前n个元素
     * 4. distinct() - 筛选，通过元素的hashcode(), equals()去除重复元素
     * <p>
     * 二，映射
     * <p>
     * 三， 排序
     */
    @Test
    public void testFilter() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = col.stream();
        stream.filter(t -> t % 2 == 0).forEach(System.out::println);
        System.out.println("*******");
        col.stream().limit(3).forEach(System.out::println);
        System.out.println("*******");
        col.stream().skip(2).forEach(System.out::println);

        System.out.println("*******");
        int[] arr = new int[]{1, 2, 3, 4, 4, 2, 5};
        IntStream st = Arrays.stream(arr);
        st.distinct().forEach(System.out::println);
    }

    // https://www.youtube.com/watch?v=jPjOW6f1_EA&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=678

    /**
     * 映射
     */
    @Test
    public void testMap() {
        // map(Function f) - 接收一个函数作为参数，将元素转换成其它形式或提取信息，该函数会被
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        // 获取员工姓名长度大于3的员工姓名
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> nameStream = employees.stream().map(Employee::getName);
        nameStream.filter(name -> name.length() > 3).forEach(System.out::println);

        // flatMap(Function f) - 接收一个函数作为参数，将流中的每个值换成另外一个流，然后把所有流链接成一个流
        Stream<Stream<Character>> streamStream = list.stream().map(StreamApi::fromStringToStream);
        streamStream.forEach(stream -> stream.forEach(System.out::println));

        System.out.println("*********");

        Stream<Character> characterStream = list.stream().flatMap(StreamApi::fromStringToStream);
        characterStream.forEach(System.out::println);
    }

    /* 将字符串中的多个字符集合转换为对应的Stream实例 */
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }

        return list.stream();
    }

    @Test
    public void test3() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

//        list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);
    }

    /**
     * 排序
     * https://www.youtube.com/watch?v=DlHnbbS3bBY&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=679
     */
    @Test
    public void testSort() {
        List<Integer> list = Arrays.asList(12, 43, 65, 34, 72, 87);
        list.stream().sorted().forEach(System.out::println);

        System.out.println("***********");

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(System.out::println);
    }


    /**
     * 终止操作
     * <p>
     * 一， 匹配与查找
     * 1， allMatch(Predicate p) - 检查是否匹配所有的元素
     * 2， anyMatch(Predicate p) - 检查是否至少匹配一个元素
     * 3， noneMatch(Predicate p) - 检查是否没有匹配的元素
     * 4, findFirst - 返回第一个元素
     * 5， findAny - 返回当前流中的任意元素
     * 6, count - 返回流中元素的个数
     * 7, max(Comparator c) - 返回流中的最大值
     * 8, min(Comparator c) - 返回流中的最小值
     * 9, forEach(Consumer c) - 内部迭代
     * <p>
     * 二，归约
     * 1, reduce(T identity, BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
     * 2, reduce(BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
     * <p>
     * 三， 收集
     * 1, collect(Collector c)
     */
    @Test
    public void testMatchAndFind() {
        List<Employee> employees = EmployeeData.getEmployees();

//        1， allMatch(Predicate p) - 检查是否匹配所有的元素
        boolean allMatch = employees.stream().allMatch(e -> e.getName().length() > 2);
        System.out.println(allMatch);

//        2， anyMatch(Predicate p) - 检查是否至少匹配一个元素
        boolean anyMatch = employees.stream().anyMatch(e -> e.getName().length() > 3);
        System.out.println(anyMatch);

//        3， noneMatch(Predicate p) - 检查是否没有匹配的元素
        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(noneMatch);

//        4, findFirst - 返回第一个元素
        Optional<Employee> employee = employees.stream().findFirst();
        System.out.println(employee);

//        5， findAny - 返回当前流中的任意元素
        Optional<Employee> any = employees.parallelStream().findAny();
        System.out.println(any);

//        6, count - 返回流中元素的个数
        long count = employees.stream().filter(e -> e.getName().length() > 3).count();
        System.out.println(count);

//        7, max(Comparator c) - 返回流中的最大值
        Stream<Integer> stream = employees.stream().map(Employee::getId);
        Optional<Integer> max = stream.max(Integer::compare);
        System.out.println(max);

//        8, min(Comparator c) - 返回流中的最小值
        Optional<Employee> min = employees.stream().min(Comparator.comparingInt(Employee::getId));
        System.out.println(min);

//        9, forEach(Consumer c) - 内部迭代
        employees.stream().forEach(System.out::println);

        // 使用集合的迭代
        employees.forEach(System.out::println);
    }

    @Test
    public void testReduce() {

//        1, reduce(T identity, BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

//        2, reduce(BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Integer> stream = employees.stream().map(Employee::getId);
        Optional<Integer> reduce1 = stream.reduce(Integer::sum);
        System.out.println(reduce1);

        Stream<Integer> stream2 = employees.stream().map(Employee::getId);
        Optional<Integer> reduce2 = stream2.reduce((d1, d2) -> d1 + d2);
        System.out.println(reduce2);
    }

    @Test
    public void testCollect() {
        List<Employee> employees = EmployeeData.getEmployees();

        List<Employee> collect = employees.stream().filter(e -> e.getId() > 1002).collect(Collectors.toList());
        collect.forEach(System.out::println);

        Set<Employee> collect2 = employees.stream().filter(e -> e.getId() > 1002).collect(Collectors.toSet());
        collect2.forEach(System.out::println);
    }
}
