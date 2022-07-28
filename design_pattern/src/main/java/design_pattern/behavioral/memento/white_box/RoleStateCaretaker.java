package design_pattern.behavioral.memento.white_box;

/**
 * @author Yanan Lyu
 * @date 2/25/22 9:55 AM
 * @description 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    // 声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
