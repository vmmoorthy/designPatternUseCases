package factory;

public class Main {
    public static void main(String[] args) {
        // Create Email Notification
        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        if (emailNotification != null) {
            emailNotification.send("Hello via Email!");
        }

        // Create SMS Notification
        Notification smsNotification = NotificationFactory.createNotification("SMS");
        if (smsNotification != null) {
            smsNotification.send("Hello via SMS!");
        }

        // Create Push Notification
        Notification pushNotification = NotificationFactory.createNotification("PUSH");
        if (pushNotification != null) {
            pushNotification.send("Hello via Push Notification!");
        }

        // Attempt to create an unknown notification type
        try {
            NotificationFactory.createNotification("FAX");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
