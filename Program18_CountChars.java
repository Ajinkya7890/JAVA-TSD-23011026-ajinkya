import java.util.Scanner;

public class Program18_CountChars {
   public Program18_CountChars() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter string: ");
      String var2 = var1.nextLine();
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      char[] var7 = var2.toCharArray();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         char var10 = var7[var9];
         if (Character.isDigit(var10)) {
            ++var5;
         } else if (Character.isLetter(var10)) {
            var10 = Character.toLowerCase(var10);
            if ("aeiou".indexOf(var10) >= 0) {
               ++var3;
            } else {
               ++var4;
            }
         } else if (!Character.isWhitespace(var10)) {
            ++var6;
         }
      }

      System.out.println("Vowels=" + var3 + " Consonants=" + var4 + " Digits=" + var5 + " Special=" + var6);
      var1.close();
   }
}
