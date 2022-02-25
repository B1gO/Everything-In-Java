package design_pattern.visitor;

/**
 * @author Yanan Lyu
 * @date 2/25/22 8:32 AM
 * @description 访问者具体实现类
 */
public class SomeOne implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
