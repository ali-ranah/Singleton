package singleton_Tasks.Task_1.example2;

public class SecondExample {
    private static final SecondExample instance = new SecondExample();
    private int value;

    private SecondExample() {
        // Private constructor to prevent instantiation from outside
    }

    public static SecondExample getInstance() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value_) {
        value = value_;
    }

    public static void main(String[] args) throws Exception {
       
        // Using the SecondExample class
        SecondExample.getInstance().setValue(24);
        System.out.println("value of (SecondExample)= " + SecondExample.getInstance().getValue());

       
    }
}
