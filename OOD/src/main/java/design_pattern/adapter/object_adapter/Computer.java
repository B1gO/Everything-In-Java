package design_pattern.adapter.object_adapter;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/6/22 11:30 AM
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card can not be null");
        }

        return sdCard.readSD();
    }
}
