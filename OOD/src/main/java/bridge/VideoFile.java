package bridge;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 1:16 PM
 * @description 实现化（Implementor）角色 ：定义实现化角色的接口，供扩展抽象化角色调用。
 */
public interface VideoFile {
    void decode(String fileName);
}
