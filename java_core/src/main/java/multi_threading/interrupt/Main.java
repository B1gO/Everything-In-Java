package multi_threading.interrupt;

/**
 * @author b1go
 * @date 5/11/22 11:29 PM
 * @description 中断线程就是其他线程给该线程发一个信号，该线程收到信号后结束执行run()方法，使得自身线程能立刻结束运行。
 */
public class Main {
    /**
     * @description 仔细看上述代码，main线程通过调用t.interrupt()方法中断t线程，但是要注意，interrupt()方法仅仅向t线程发出了“中断请求”，
     * 至于t线程是否能立刻响应，要看具体代码。而t线程的while循环会检测isInterrupted()，所以上述代码能正确响应interrupt()请求，
     * 使得自身立刻结束运行run()方法。
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1); // 暂停1毫秒. Question, who sleep?
        t.interrupt(); // 中断t线程. Question, who is interrupted? 一定会被成功中断么？
        t.join(); // 等待t线程结束. Question, who is running, and who stopped?
        System.out.println("end");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        // Question, where is isInterrupted() from?
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }

        /**
         * comment off above while loop and try the below while loop.
         */
//        while (true) {
//            n++;
//            System.out.println(n + " hello!");
//        }
    }
}
