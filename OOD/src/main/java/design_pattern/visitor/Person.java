package design_pattern.visitor;

/**
 * @author Yanan Lyu
 * @date 2/25/22 8:28 AM
 */
public interface Person {

    void feed(Cat cat);
    void feed(Dog dog);
}
