package design_pattern.state.after;

/**
 * @author Yanan Lyu
 * @date 2/21/22 7:50 AM
 * @description 电梯关闭状态类
 */
public class ClosingState extends LiftState {
    @Override
    public void close() {
        //电梯关门，这是关闭状态要实现的动作
        System.out.println("电梯 关 ...");
    }

    // 电梯门关了可以再打开
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    // 电梯门关了，就允许开始run
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    // 电梯门关着，我就不按楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
