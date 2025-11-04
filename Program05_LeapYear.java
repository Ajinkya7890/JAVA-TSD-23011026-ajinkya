import java.util.Scanner;

public class Program05_LeapYear {
   public Program05_LeapYear() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter year: ");
      int var2 = var1.nextInt();
      boolean var3 = var2 % 4 == 0 && var2 % 100 != 0 || var2 % 400 == 0;
      System.out.println("" + var2 + (var3 ? " is a leap year." : " is NOT a leap year."));
      var1.close();
   }
}
