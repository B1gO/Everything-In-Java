package design_pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yanan Lyu
 * @date 2/17/22 9:55 PM
 * @description 请求者角色，调用者角色
 */
public class Waitor {

    /**
     * 持有多个命令对象
      */
    private final List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        this.commands.add(cmd);
    }

    /**
     * 发起命令的功能 喊订单来了，厨师边开始执行
     */
    public void orderUp() {
        System.out.println("waitor: 大厨，新订单来了。。。。");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
