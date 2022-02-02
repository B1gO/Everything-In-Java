package design_pattern.flyweight.jdk;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 10:59 AM
 */
public class Demo {

    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1 and i2 are same object? " + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i3 and i4 are same object? " + (i3 == i4));
    }
}
