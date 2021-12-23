/**
 * Double Check
 * @author Yanan Lyu
 * @date 5/24/21 11:09 PM
 */
public class Singleton {

    /**
     * volatile 使得修改值立即更新到主程序
     */
    private static volatile Singleton instance;

    /**
     * make constructor be private
     */
    private Singleton() {};

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
