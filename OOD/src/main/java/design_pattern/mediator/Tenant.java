package design_pattern.mediator;

/**
 * @author Yanan Lyu
 * @date 2/23/22 7:49 AM
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系（沟通）
    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 获取信息的方法
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是： " + message);
    }
}
