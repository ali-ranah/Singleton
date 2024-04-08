
package singleton_Tasks.Task_1.example3;

public class ThirdExample {
    private static volatile ThirdExample instance = null;

    private ThirdExample() {}

    public static ThirdExample getInstance() {
        if (instance == null) {
            synchronized(ThirdExample.class) {
                if (instance == null) {
                    instance = new ThirdExample();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        //using third example
        ThirdExample instance = ThirdExample.getInstance();
        System.out.println("Output of Task 1 Example # 3 is:  ");
        System.out.println("Instance: " + instance);
    }
}
