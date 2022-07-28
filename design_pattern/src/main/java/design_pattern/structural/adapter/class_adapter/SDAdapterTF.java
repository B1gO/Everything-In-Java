package design_pattern.structural.adapter.class_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:34 AM
 * @description 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
