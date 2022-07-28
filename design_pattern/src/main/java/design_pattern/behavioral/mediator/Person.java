package design_pattern.behavioral.mediator;

/**
 * @author Yanan Lyu
 * @date 2/23/22 7:47 AM
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
