package singleton_Tasks.Task3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Configuration {
    // Step 1: Private inner static class to hold the singleton instance
    private static class ConfigurationHolder {
        // Step 2: Initialize the singleton instance
        private static final Configuration INSTANCE = new Configuration();
    }

    // Step 3: Private constructor to prevent instantiation
    private Configuration() {
        try {
            // Load properties from file
          
            InputStream inputStream = Configuration.class.getResourceAsStream("config.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            // Populate configuration map
            Enumeration<Object> enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                config.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Step 4: Public method to access the singleton instance
    public static Configuration getInstance() {
        return ConfigurationHolder.INSTANCE;
    }

    // Step 5: Instance variable to hold configuration values
    private HashMap<String, String> config = new HashMap<>();

    // Step 6: Public method to retrieve configuration value for a given key
    public String getValue(String key) {
        return config.get(key);
    }
}
