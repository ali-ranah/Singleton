// Source code is decompiled from a .class file using FernFlower decompiler.
package singleton_Tasks.Task_2;

public class Connection {
   private static Connection instance;
   private String username = "faizan ahmed";

   private Connection() {
   }

   public static Connection getInstance() {
      if (instance == null) {
         instance = new Connection();
      }

      return instance;
   }

   public void getData() {
      System.out.println(this.username + " This is the data retrieved from the DB");
   }
}
