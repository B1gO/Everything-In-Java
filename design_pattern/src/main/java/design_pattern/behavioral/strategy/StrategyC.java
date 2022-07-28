package design_pattern.behavioral.strategy;

/**
 * @author Yanan Lyu
 * @date 2/16/22 10:07 AM
 * @description 具体策略(Concrete Strategy)类: 实现了抽象策略定义的接口,提供具体的算法实现或行
 * 为。
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商");
    }
}
