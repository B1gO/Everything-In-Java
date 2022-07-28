package design_pattern.behavioral.state.after;

/**
 * @author Yanan Lyu
 * @date 2/21/22 7:48 AM
 * @description 抽象状态类
 */
public abstract class LiftState {
    /**
     * 环境角色类变量
     */
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
