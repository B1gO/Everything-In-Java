package design_pattern.structural.decorator;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 12:32 PM
 * @description 具体构件（Concrete Component）角色
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "Fried Noodles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
