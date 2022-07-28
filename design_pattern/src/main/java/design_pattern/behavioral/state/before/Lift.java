package design_pattern.behavioral.state.before;

/**
 * @author Yanan Lyu
 * @date 2/21/22 7:20 AM
 * @description ILift的子实现类
 */
public class Lift implements ILift {

    /**
     * 声明一个记录当前电梯状态的变量
     */
    private int state;

    /**
     * 设置电梯状态功能
     * @param state 状态输入
     */
    @Override
    public void setState(int state) {
        this.state = state;
    }

    /**
     * 电梯操作功能
     */
    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                // 什么事都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了。。");
                // 设置为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。");
                // 设置为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                // 什么事都不做
                break;
            default:
                throw new RuntimeException("错误状态，code bug");
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("电梯关门了。。。");
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
            default:
                throw new RuntimeException("错误状态，code bug");
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
            default:
                throw new RuntimeException("错误状态，code bug");
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
            default:
                throw new RuntimeException("错误状态，code bug");
        }
    }
}
