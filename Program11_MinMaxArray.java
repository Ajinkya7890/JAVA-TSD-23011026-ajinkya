import java.util.Scanner;

public class Program11_MinMaxArray {
   public Program11_MinMaxArray() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int var2 = var1.nextInt();
      if (var2 <= 0) {
         System.out.println("Empty array.");
         var1.close();
      } else {
         int[] var3 = new int[var2];
         System.out.println("Enter elements:");

         int var4;
         for(var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.nextInt();
         }

         var4 = var3[0];
         int var5 = var3[0];
         int[] var6 = var3;
         int var7 = var3.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var6[var8];
            if (var9 < var4) {
               var4 = var9;
            }

            if (var9 > var5) {
               var5 = var9;
            }
         }

         System.out.println("Min=" + var4 + " Max=" + var5);
         var1.close();
      }
   }
}
