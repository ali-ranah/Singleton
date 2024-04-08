package singleton_Tasks.Task_2.Task2SecondExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Configuration {
    private static Configuration instance;
    private HashMap<String, String> config = new HashMap<String, String>();

    private Configuration() {
        try {
            InputStream inputStream = Configuration.class.getClassLoader().getResourceAsStream("singleton_example/Task2SecondExample/config.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

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

    public String getValue(String key) {
        String value = null;
        if (config.containsKey(key)) {
            value = config.get(key);
        }
        return value;
    }

    public static Configuration getInstance() {
        if (instance == null)
            instance = new Configuration();
        return instance;
    }
}
