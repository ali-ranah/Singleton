package singleton_Tasks.Task3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReaderTest {
    public static void main(String[] args) {
        try {
            // Load properties file from classpath
            InputStream inputStream = Configuration.class.getResourceAsStream("/singleton_example/Task3/config.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            // Print contents of properties file
            properties.forEach((key, value) -> System.out.println(key + "=" + value));

            // Close input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
