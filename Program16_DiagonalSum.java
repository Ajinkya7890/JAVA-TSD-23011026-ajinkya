import java.util.Scanner;

public class Program16_DiagonalSum {
   public Program16_DiagonalSum() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter n (square matrix): ");
      int var2 = var1.nextInt();
      int[][] var3 = new int[var2][var2];
      System.out.println("Enter elements:");

      int var4;
      int var5;
      for(var4 = 0; var4 < var2; ++var4) {
         for(var5 = 0; var5 < var2; ++var5) {
            var3[var4][var5] = var1.nextInt();
         }
      }

      var4 = 0;

      for(var5 = 0; var5 < var2; ++var5) {
         var4 += var3[var5][var5];
      }

      System.out.println("Sum of main diagonal = " + var4);
      var1.close();
   }
}
