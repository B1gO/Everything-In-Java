package design_pattern.structural.bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:23 PM
 * @description 扩展抽象化（Refined Abstraction）角色
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
