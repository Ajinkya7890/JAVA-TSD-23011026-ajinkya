import java.util.Scanner;

public class Program08_FibonacciDoWhile {
   public Program08_FibonacciDoWhile() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number of terms: ");
      int var2 = var1.nextInt();
      int var3 = 0;
      int var4 = 1;
      int var5 = 0;
      if (var2 <= 0) {
         System.out.println("No terms.");
         var1.close();
      } else {
         do {
            System.out.print("" + var3 + (var5 < var2 - 1 ? " " : ""));
            int var6 = var3 + var4;
            var3 = var4;
            var4 = var6;
            ++var5;
         } while(var5 < var2);

         System.out.println();
         var1.close();
      }
   }
}
