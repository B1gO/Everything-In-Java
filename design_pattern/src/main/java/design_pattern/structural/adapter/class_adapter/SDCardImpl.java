package design_pattern.structural.adapter.class_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:29 AM
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read msg: hello world SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
