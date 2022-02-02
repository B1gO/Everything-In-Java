package design_pattern.adapter.class_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:32 AM
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("======================");
        //定义适配器类（SD兼容TF）
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
