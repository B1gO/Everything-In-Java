package design_pattern.behavioral.responsibility;

/**
 * @author Yanan Lyu
 * @date 2/18/22 8:05 AM
 * @description 具体的处理者
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("总经理审批：同意");
    }
}
