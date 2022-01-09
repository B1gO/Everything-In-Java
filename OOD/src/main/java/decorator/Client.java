package decorator;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 12:42 PM
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + ": " + food.cost() + "RMB");

        System.out.println("===========================");

        food = new Egg(food);
        System.out.println(food.getDesc() + ": " + food.cost() + "RMB");

        System.out.println("===========================");
        food = new Egg(food);
        System.out.println(food.getDesc() + ": " + food.cost() + "RMB");

        System.out.println("===========================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + ": " + food.cost() + "RMB");
    }
}
