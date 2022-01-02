package factory.factory_method;

import factory.simplefactory.coffee.Coffee;
import factory.simplefactory.coffee.SimpleCoffeeFactory;

/**
 * @author ylyu
 * @date 1/2/22 9:06 AM
 * @version 1.0
 */
public class CoffeeStore {
    public factory.simplefactory.coffee.Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
