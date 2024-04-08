
package singleton_Tasks.Task_2;

public class Demo {
    public static void main(String[] args) {
        Connection c = Connection.getInstance();
        c.getData();
    }
}

