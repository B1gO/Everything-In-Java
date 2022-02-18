package design_pattern.strategy;

/**
 * @author Yanan Lyu
 * @date 2/16/22 10:16 AM
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("=======");

        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        System.out.println("=========");

        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
        System.out.println("=========");
    }
}
