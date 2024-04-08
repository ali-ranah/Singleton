package singleton_Tasks.Task3;

public class TestConfiguration {
    public static void main(String[] args) {
        // Get the singleton instance of Configuration
        Configuration configuration = Configuration.getInstance();

        // Retrieve and print configuration values
        System.out.println("Value for 'key1': " + configuration.getValue("key1"));
        System.out.println("Value for 'key2': " + configuration.getValue("key2"));
        System.out.println("Value for 'key3': " + configuration.getValue("key3"));
    }
}
