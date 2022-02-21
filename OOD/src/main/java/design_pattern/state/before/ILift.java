package design_pattern.state.before;

/**
 * @author Yanan Lyu
 * @date 2/21/22 7:16 AM
 * @description 电梯接口
 */
public interface ILift {
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    /**
     *  设置电梯状态功能
     * @param state 状态
     */
    void setState(int state);

    /**
     * 电梯操作功能
     */
    void open();
    void close();
    void run();
    void stop();
}
