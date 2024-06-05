package factory;

// Concrete Email Notification class
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification with message: " + message);
    }
}

// Concrete SMS Notification class
class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS Notification with message: " + message);
    }
}

// Concrete Push Notification class
class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification with message: " + message);
    }
}
