package multi_threading.creat;

/**
 * @author Yanan Lyu
 * @date 3/21/22 9:02 AM
 */
public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        System.out.println("***********");

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("Start new thread by implementing Runnable with lambda"));
        t3.start();
    }
}
