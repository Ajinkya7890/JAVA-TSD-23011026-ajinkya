import java.util.Scanner;

public class Program06_PrimeCheck {
   public Program06_PrimeCheck() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number: ");
      int var2 = var1.nextInt();
      boolean var3 = true;
      if (var2 <= 1) {
         var3 = false;
      }

      for(int var4 = 2; var4 * var4 <= var2 && var3; ++var4) {
         if (var2 % var4 == 0) {
            var3 = false;
         }
      }

      System.out.println("" + var2 + (var3 ? " is prime." : " is not prime."));
      var1.close();
   }
}
