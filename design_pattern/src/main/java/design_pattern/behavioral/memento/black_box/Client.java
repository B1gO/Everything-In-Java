package design_pattern.behavioral.memento.black_box;

/**
 * @author Yanan Lyu
 * @date 2/25/22 9:56 AM
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-------------大战boss前-------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        // 将游戏角色内部状态进行备份
        // 创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("-------------大战boss后-------------");
        // 损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("-------------恢复之前的状态-------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
