package factory.withoutfactory;

/**
 * @author ylyu
 * @date 1/2/22 9:06 AM
 * @version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee;

        if ("american".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equalsIgnoreCase(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("no the coffee you ordered");
        }

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
