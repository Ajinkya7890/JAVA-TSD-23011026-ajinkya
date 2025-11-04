import java.util.HashMap;
import java.util.Scanner;

public class Program21_WordFrequency {
   public Program21_WordFrequency() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter sentence:");
      String var2 = var1.nextLine().toLowerCase();
      String[] var3 = var2.split("\\W+");
      HashMap var4 = new HashMap();
      String[] var5 = var3;
      int var6 = var3.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String var8 = var5[var7];
         if (var8.length() > 0) {
            var4.put(var8, (Integer)var4.getOrDefault(var8, 0) + 1);
         }
      }

      System.out.println("Frequencies: " + String.valueOf(var4));
      var1.close();
   }
}
