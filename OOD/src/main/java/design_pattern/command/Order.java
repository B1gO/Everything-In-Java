package design_pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yanan Lyu
 * @date 2/17/22 9:42 PM
 * @description 订单类
 */
public class Order {

    /**
     * 餐桌号码
      */
    private int diningTable;

    /**
     * 所下的餐品及分数
     */
    private final Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        this.foodDir.put(name, num);
    }
}
