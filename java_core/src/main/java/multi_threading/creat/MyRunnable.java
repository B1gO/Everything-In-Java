package multi_threading.creat;

/**
 * @author Yanan Lyu
 * @date 3/21/22 9:04 AM
 */
public class MyRunnable implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Start new thread using Runnable");
    }
}
