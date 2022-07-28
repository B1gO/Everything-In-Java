package design_pattern.structural.bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:24 PM
 */
public class Client {

    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AviFile());
        system.play("war wolf 3");
    }
}
