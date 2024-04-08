package singleton_Tasks.Task_2.Task2SecondExample;

public class Demo {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        System.out.println(config.getValue("mode"));
        System.out.println(config.getValue("font-size"));
        System.out.println(config.getValue("font-type"));
    }
}
