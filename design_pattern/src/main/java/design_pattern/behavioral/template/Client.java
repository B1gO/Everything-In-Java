package design_pattern.behavioral.template;

/**
 * @author Yanan Lyu
 * @date 2/15/22 10:38 PM
 */
public class Client {
    public static void main(String[] args) {
        // 炒包菜
        // 创建对象
        ConcreteClassBaoCai baoCai = new ConcreteClassBaoCai();
        // 调用炒菜的功能
        baoCai.cookProcess();
    }
}
