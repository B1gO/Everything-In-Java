package design_pattern.state.after;

/**
 * @author Yanan Lyu
 * @date 2/21/22 7:50 AM
 * @description 电梯开启状态类
 */
public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        // 调用当前状态中的context中的close方法
        super.context.close();
    }

    @Override
    public void run() {
        // 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}
