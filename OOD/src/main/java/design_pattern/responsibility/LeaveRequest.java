package design_pattern.responsibility;

/**
 * @author Yanan Lyu
 * @date 2/18/22 7:56 AM
 * @description 请假条类
 */
public class LeaveRequest {

    private final String name;
    private final int num;
    private final String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
