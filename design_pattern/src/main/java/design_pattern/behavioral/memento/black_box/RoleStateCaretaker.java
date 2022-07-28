package design_pattern.behavioral.memento.black_box;

/**
 * @author Yanan Lyu
 * @date 2/25/22 9:55 AM
 * @description 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    /**
     * 声明RoleStateMemento类型的变量
      */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setRoleStateMemento(Memento memento) {
        this.memento = memento;
    }
}
