package design_pattern.structural.flyweight;

import java.util.HashMap;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 10:35 AM
 * @description 将该类设置为单例
 */
public class BoxFactory {

    private final HashMap<String, AbstractBox> map;
    private static final BoxFactory factory = new BoxFactory();

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public static BoxFactory getInstance() {
        return factory;
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
