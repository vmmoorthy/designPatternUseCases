package singleton;

public class Main {
    public static void main(String[] args) {
        // Access the ConfigurationManager instance
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Retrieve configuration properties
        String dbUrl = configManager.getProperty("database.url");
        String dbUsername = configManager.getProperty("database.username");
        String dbPassword = configManager.getProperty("database.password");
        String appName = configManager.getProperty("application.name");

        // Print the properties
        System.out.println("Database URL: " + dbUrl);
        System.out.println("Database Username: " + dbUsername);
        System.out.println("Database Password: " + dbPassword);
        System.out.println("Application Name: " + appName);
    }
}
