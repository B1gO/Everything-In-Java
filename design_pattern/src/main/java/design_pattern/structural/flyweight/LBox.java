package design_pattern.structural.flyweight;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 10:31 AM
 * @description 具体享元（Concrete Flyweight）角色 ：它实现了抽象享元类，称为享元对象；在具体享元
 * 类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享
 * 元类提供唯一的享元对象。
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}
