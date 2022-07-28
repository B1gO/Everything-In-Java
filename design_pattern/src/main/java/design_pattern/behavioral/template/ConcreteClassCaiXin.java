package design_pattern.behavioral.template;

/**
 * @author Yanan Lyu
 * @date 2/15/22 10:34 PM
 * @description 具体子类(Concrete Class):实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级
 * 逻辑的组成步骤。
 */
public class ConcreteClassCaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
