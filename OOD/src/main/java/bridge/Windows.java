package bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:22 PM
 * @description 扩展抽象化（Refined Abstraction）角色
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
