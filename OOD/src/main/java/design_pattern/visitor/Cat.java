package design_pattern.visitor;

/**
 * @author Yanan Lyu
 * @date 2/25/22 8:30 AM
 * @description 具体元素角色类
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        // 访问者给宠物猫喂食
        person.feed(this);
        System.out.println("好好吃，喵喵喵。。。");
    }
}
