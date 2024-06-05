package singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Singleton class for Configuration Settings
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties properties;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Public method to provide access to the single instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    // Method to get a property value
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

