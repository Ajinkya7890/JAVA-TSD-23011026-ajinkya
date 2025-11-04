import java.util.Arrays;
import java.util.Scanner;

public class Program14_BinarySearch {
   public Program14_BinarySearch() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number of elements: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter elements (unsorted OK, we'll sort):");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      Arrays.sort(var3);
      System.out.print("Enter key: ");
      var4 = var1.nextInt();
      int var5 = 0;
      int var6 = var2 - 1;
      int var7 = -1;

      while(var5 <= var6) {
         int var8 = var5 + (var6 - var5) / 2;
         if (var3[var8] == var4) {
            var7 = var8;
            break;
         }

         if (var3[var8] < var4) {
            var5 = var8 + 1;
         } else {
            var6 = var8 - 1;
         }
      }

      if (var7 >= 0) {
         System.out.println("Found at index " + var7 + " in sorted array.");
      } else {
         System.out.println("Not found.");
      }

      var1.close();
   }
}
