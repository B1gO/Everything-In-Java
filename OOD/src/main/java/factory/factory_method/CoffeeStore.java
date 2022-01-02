package factory.factory_method;

/**
 * @author ylyu
 * @date 1/2/22 9:06 AM
 * @version 1.0
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}