package factory.simplefactory.staticfactory;

/**
 * @author ylyu
 * @date 1/2/22 9:06 AM
 * @version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
