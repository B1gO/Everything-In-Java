package design_pattern.flyweight;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 10:26 AM
 * @description 抽象享元角色（Flyweight）：通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公
 * 共的方法，这些方法可以向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法
 * 来设置外部数据（外部状态）。
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状: " + getShape() + ", color: " + color);
    }
}
