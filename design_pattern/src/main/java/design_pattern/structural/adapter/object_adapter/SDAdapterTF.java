package design_pattern.structural.adapter.object_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:34 AM
 * @description 适配器类
 */
public class SDAdapterTF implements SDCard {

    // 声明适配者类
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
