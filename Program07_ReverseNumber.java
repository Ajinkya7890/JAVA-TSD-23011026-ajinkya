import java.util.Scanner;

public class Program07_ReverseNumber {
   public Program07_ReverseNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int var2 = var1.nextInt();

      int var3;
      for(var3 = 0; var2 != 0; var2 /= 10) {
         var3 = var3 * 10 + var2 % 10;
      }

      System.out.println("Reversed: " + var3);
      var1.close();
   }
}
