import java.util.Scanner;

public class Program12_BubbleSort {
   public Program12_BubbleSort() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter size: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter elements:");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      int var5;
      int var6;
      for(var4 = 0; var4 < var2 - 1; ++var4) {
         for(var5 = 0; var5 < var2 - 1 - var4; ++var5) {
            if (var3[var5] > var3[var5 + 1]) {
               var6 = var3[var5];
               var3[var5] = var3[var5 + 1];
               var3[var5 + 1] = var6;
            }
         }
      }

      System.out.print("Sorted: ");
      int[] var8 = var3;
      var5 = var3.length;

      for(var6 = 0; var6 < var5; ++var6) {
         int var7 = var8[var6];
         System.out.print("" + var7 + " ");
      }

      System.out.println();
      var1.close();
   }
}
