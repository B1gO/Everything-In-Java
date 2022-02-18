package design_pattern.responsibility;

/**
 * @author Yanan Lyu
 * @date 2/18/22 7:57 AM
 * @description 抽象处理者类
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 2;
    protected final static int NUM_SEVEN = 3;

    /**
     * 该领到处理的请求天数区间
     */
    private final int numStart;
    private int numEnd;

    /**
     * 声明后继者
     */
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @description 各级领到处理请假条的方法
     * @param leave : 请假条
     */
    protected abstract void handleLeave(LeaveRequest leave);

    public final void submit(LeaveRequest leave) {
        this.handleLeave(leave);
        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束！");
        }
    }
}
