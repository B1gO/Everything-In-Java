package multi_threading.status;

/**
 * @author Yanan Lyu
 * @date 3/21/22 9:20 AM
 * @description 调用t.join()的代码会在t线程运行完之后再继续运行
 */
public class JoinTest {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread end");
        });

        System.out.println("Main start");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stop");
    }
}
