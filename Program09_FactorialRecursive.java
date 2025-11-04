import java.util.Scanner;

public class Program09_FactorialRecursive {
   public Program09_FactorialRecursive() {
   }

   public static long factorial(int var0) {
      return var0 <= 1 ? 1L : (long)var0 * factorial(var0 - 1);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter n: ");
      int var2 = var1.nextInt();
      if (var2 < 0) {
         System.out.println("Negative not allowed.");
      } else {
         System.out.println("" + var2 + "! = " + factorial(var2));
      }

      var1.close();
   }
}
