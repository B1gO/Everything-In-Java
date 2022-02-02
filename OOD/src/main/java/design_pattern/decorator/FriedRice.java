package design_pattern.decorator;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 12:29 PM
 * @description 具体构件（Concrete Component）角色
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "fried rice");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
