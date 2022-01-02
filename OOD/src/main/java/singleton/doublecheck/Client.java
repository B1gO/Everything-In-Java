package singleton.doublecheck;

/**
 * @author ylyu
 * @date 1/1/22 7:52 PM
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}
