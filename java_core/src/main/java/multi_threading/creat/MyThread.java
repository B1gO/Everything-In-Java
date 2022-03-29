package multi_threading.creat;

/**
 * @author Yanan Lyu
 * @date 3/21/22 9:02 AM
 */
public class MyThread extends Thread {
    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     */
    @Override
    public void run() {
        System.out.println("start new thread using extends thread");
    }
}
