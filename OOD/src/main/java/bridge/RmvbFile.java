package bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:19 PM
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb file: " + fileName);
    }
}
