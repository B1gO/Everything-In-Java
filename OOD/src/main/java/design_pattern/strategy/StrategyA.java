package design_pattern.strategy;

/**
 * @author Yanan Lyu
 * @date 2/16/22 10:07 AM
 * @description 具体策略(Concrete Strategy)类: 实现了抽象策略定义的接口,提供具体的算法实现或行
 * 为。
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
