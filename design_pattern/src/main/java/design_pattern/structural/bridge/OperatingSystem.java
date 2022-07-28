package design_pattern.structural.bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:20 PM
 * @description 抽象化（Abstraction）角色
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
