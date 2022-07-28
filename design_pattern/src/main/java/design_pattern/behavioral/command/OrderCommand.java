package design_pattern.behavioral.command;

import java.util.Map;
import java.util.Set;

/**
 * @author Yanan Lyu
 * @date 2/17/22 9:50 PM
 * @description 具体命令类
 */
public class OrderCommand implements Command{

    /**
     * 持有接受者对象
     */
    private final SeniorChef receiver;
    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单： ");
        Map<String, Integer> foodDir = order.getFoodDir();

        Set<String> keySet = foodDir.keySet();
        for (String foodName: keySet) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }

        System.out.println(order.getDiningTable() + "桌的饭菜准备完毕。");
    }
}
