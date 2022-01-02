package factory.withoutfactory;

/**
 * @author ylyu
 * @date 1/2/22 9:03 AM
 * @version 1.0
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("add sugar");
    }

    public void addMilk() {
        System.out.println("add milk");
    }
}
