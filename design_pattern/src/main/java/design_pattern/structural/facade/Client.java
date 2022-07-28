package design_pattern.structural.facade;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 2:43 PM
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationsFacade facade = new SmartApplicationsFacade();
        facade.say("turn on");
        System.out.println("====================");
        facade.say("turn off");
    }
}
