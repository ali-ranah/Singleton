package singleton_Tasks.Task_1.example1;

public class FirstExample {
    private static FirstExample instance = null;
    private int value;

    private FirstExample() {}

    public static FirstExample getInstance() {
        if (instance == null) {
            instance = new FirstExample();
        }
        return instance;
    }

    public static void destruct() {
        instance = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public static void main(String[] args) throws Exception {
        // Using the FirstExample class
        FirstExample.getInstance().setValue(42);
        System.out.println("value  of (FirstExample)= " + FirstExample.getInstance().getValue());
        FirstExample.destruct();

    }
}
