package multi_threading.creat;

/**
 * @author b1go
 * @date 3/21/22 9:02 AM
 */
public class Main {
    public static void main(String[] args) {
        // use extends thread
        Thread t = new MyThread();
        t.start();
        System.out.println("***********");

        // use implements Runnable
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        // use lambda
        Thread t3 = new Thread(() -> System.out.println("Start new thread by implementing Runnable with lambda"));
        t3.start();
    }
}
