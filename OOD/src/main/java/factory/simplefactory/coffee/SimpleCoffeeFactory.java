package factory.simplefactory.coffee;

/**
 * @author ylyu
 * @date 1/2/22 9:21 AM
 * @version 1.0
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee;

        if ("american".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equalsIgnoreCase(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("no the coffee you ordered");
        }

        return coffee;
    }
}
