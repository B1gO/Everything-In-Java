package design_pattern.structural.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 9:33 AM
 * @description 树枝节点（Composite）：定义树枝节点的行为，存储子节点，组合树枝节点和叶子节点形成一
 * 个树形结构。
 */
public class Menu extends MenuComponent {

    private final List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);

        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
