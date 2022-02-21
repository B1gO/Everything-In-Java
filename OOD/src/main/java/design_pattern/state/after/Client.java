package design_pattern.state.after;

/**
 * @author Yanan Lyu
 * @date 2/21/22 8:06 AM
 */
public class Client {
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        // 设置当前电梯装态
        context.setLiftState(new RunningState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
