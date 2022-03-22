package multi_threading.status;

import java.time.LocalTime;

/**
 * @author Yanan Lyu
 * @date 3/21/22 9:29 AM
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            int n = 1;
            while (true) {
                System.out.println(LocalTime.now());
                try {
                    System.out.println(n++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(5000);
            System.out.println("Main has slept for 5 seconds, waiting thread end");
            t.interrupt();
            t.join();
            System.out.println("waiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main end");
    }


}
