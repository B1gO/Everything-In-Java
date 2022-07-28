package design_pattern.structural.bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:17 PM
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi file: " + fileName);
    }
}
