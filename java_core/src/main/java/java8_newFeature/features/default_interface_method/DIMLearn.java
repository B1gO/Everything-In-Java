package java8_newFeature.features.default_interface_method;

/**
 * @author Yanan Lyu
 * @date 5/9/22 3:53 PM
 */
public interface DIMLearn {
    static final String BLOG = "is Chuwa a";

    int add(int a, int b);
    default int substract(int a, int b) {
        return a - b;
    }

    static String blogName() {
        return BLOG;
    }
}
