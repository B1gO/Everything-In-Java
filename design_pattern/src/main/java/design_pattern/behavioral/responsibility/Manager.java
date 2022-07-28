package design_pattern.behavioral.responsibility;

/**
 * @author Yanan Lyu
 * @date 2/18/22 8:05 AM
 * @description 具体的处理者
 */
public class Manager extends Handler{

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("部门经理审批：同意");
    }
}
