package design_pattern.combination;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 9:27 AM
 * @description Menu Component: 抽象根节点（Component）
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    // 添加菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 移除菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单名称
    public String getName() {
        return name;
    }

    public abstract void print();
}
