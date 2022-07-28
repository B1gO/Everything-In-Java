package design_pattern.behavioral.strategy;

/**
 * @author Yanan Lyu
 * @date 2/16/22 10:13 AM
 * @description 定义环境角色（Context）：用于连接上下文，即把促销活动推销给客户，这里可以理解为销售员
 */
public class SalesMan {

    // 聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
