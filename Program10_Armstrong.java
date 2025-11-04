import java.util.Scanner;

public class Program10_Armstrong {
   public Program10_Armstrong() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number: ");
      int var2 = var1.nextInt();
      int var3 = var2;
      int var4 = 0;

      for(int var5 = String.valueOf(Math.abs(var2)).length(); var2 != 0; var2 /= 10) {
         int var6 = Math.abs(var2 % 10);
         var4 = (int)((double)var4 + Math.pow((double)var6, (double)var5));
      }

      System.out.println("" + var3 + (var4 == var3 ? " is Armstrong." : " is NOT Armstrong."));
      var1.close();
   }
}
