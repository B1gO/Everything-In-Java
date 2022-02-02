package design_pattern.adapter.class_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:18 AM
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read msg: hello world TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
