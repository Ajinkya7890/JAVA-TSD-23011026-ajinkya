import java.util.Scanner;

public class Program17_PalindromeString {
   public Program17_PalindromeString() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter string: ");
      String var2 = var1.nextLine().replaceAll("\\s+", "").toLowerCase();
      String var3 = (new StringBuilder(var2)).reverse().toString();
      System.out.println(var3.equals(var2) ? "Palindrome" : "Not palindrome");
      var1.close();
   }
}
