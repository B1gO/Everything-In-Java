package singleton.enumclass;

/**
 * @author ylyu
 * @date 1/1/22 8:08 PM
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);
    }
}
