package design_pattern.structural.adapter.object_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:17 AM
 */
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}
