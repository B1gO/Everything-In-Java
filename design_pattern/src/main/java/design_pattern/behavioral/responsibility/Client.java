package design_pattern.behavioral.responsibility;

/**
 * @author Yanan Lyu
 * @date 2/18/22 8:11 AM
 * @description 源码例子： Filter Chain
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 6, "身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);
    }
}
