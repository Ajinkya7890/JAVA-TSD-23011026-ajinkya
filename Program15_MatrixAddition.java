import java.util.Scanner;

public class Program15_MatrixAddition {
   public Program15_MatrixAddition() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Rows: ");
      int var2 = var1.nextInt();
      System.out.print("Cols: ");
      int var3 = var1.nextInt();
      int[][] var4 = new int[var2][var3];
      int[][] var5 = new int[var2][var3];
      System.out.println("Enter matrix A:");

      int var6;
      int var7;
      for(var6 = 0; var6 < var2; ++var6) {
         for(var7 = 0; var7 < var3; ++var7) {
            var4[var6][var7] = var1.nextInt();
         }
      }

      System.out.println("Enter matrix B:");

      for(var6 = 0; var6 < var2; ++var6) {
         for(var7 = 0; var7 < var3; ++var7) {
            var5[var6][var7] = var1.nextInt();
         }
      }

      int[][] var9 = new int[var2][var3];
      System.out.println("Sum matrix:");

      for(var7 = 0; var7 < var2; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            var9[var7][var8] = var4[var7][var8] + var5[var7][var8];
            System.out.print(var9[var7][var8] + " ");
         }

         System.out.println();
      }

      var1.close();
   }
}
