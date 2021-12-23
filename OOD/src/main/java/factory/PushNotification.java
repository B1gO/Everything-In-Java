package factory;

/**
 * @author Yanan Lyu
 * @create 2021-12-23-1:47 AM
 */
public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
