
import java.util.Scanner;

public class Program01 {
   public Program01() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String var2 = var1.nextLine();
      System.out.print("Enter your age: ");
      int var3 = var1.nextInt();
      System.out.println("Welcome, " + var2 + "! You are " + var3 + " years old.");
      var1.close();
      var1.close();
   }
}
