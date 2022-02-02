package design_pattern.facade;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 2:38 PM
 * @description 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 */
public class SmartApplicationsFacade {

    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    public SmartApplicationsFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message) {
        if(message.contains("turn on")) {
            on();
        } else if (message.contains("turn off")) {
            off();
        } else {
            System.out.println("can't understand it");
        }
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
