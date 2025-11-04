import java.util.Scanner;

public class Program13_LinearSearch {
   public Program13_LinearSearch() {
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

      System.out.print("Enter key to search: ");
      var4 = var1.nextInt();
      int var5 = -1;

      for(int var6 = 0; var6 < var2; ++var6) {
         if (var3[var6] == var4) {
            var5 = var6;
            break;
         }
      }

      if (var5 >= 0) {
         System.out.println("Found at index " + var5);
      } else {
         System.out.println("Not found.");
      }

      var1.close();
   }
}
