package factory;

/**
 * @author Yanan Lyu
 * @create 2021-12-23-1:46 AM
 */
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
