package factory;

/**
 * @author Yanan Lyu
 * @create 2021-12-23-1:48 AM
 */
public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        if ("SMS".equals(channel)) {
            return new SMSNotification();
        } else if ("EMAIL".equals(channel)) {
            return new EmailNotification();
        } else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
