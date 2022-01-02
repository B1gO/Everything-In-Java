package factory.simplefactory.coffee;

/**
 * @author ylyu
 * @date 1/2/22 9:06 AM
 * @version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
