import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program20_RemoveDuplicates {
   public Program20_RemoveDuplicates() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter string: ");
      String var2 = var1.nextLine();
      LinkedHashSet var3 = new LinkedHashSet();
      StringBuilder var4 = new StringBuilder();
      char[] var5 = var2.toCharArray();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var5[var7];
         if (!var3.contains(var8)) {
            var3.add(var8);
            var4.append(var8);
         }
      }

      System.out.println("After removing duplicates: " + var4.toString());
      var1.close();
   }
}
