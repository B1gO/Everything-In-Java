package design_pattern.structural.decorator;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 12:34 PM
 * @description 抽象装饰（Decorator）角色
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
