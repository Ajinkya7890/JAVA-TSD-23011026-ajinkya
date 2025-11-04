import java.util.Scanner;

public class Program03_FtoC {
   public Program03_FtoC() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter temperature in Fahrenheit: ");
      double var2 = var1.nextDouble();
      double var4 = (var2 - 32.0) * 5.0 / 9.0;
      System.out.printf("Temperature in Celsius: %.2f%n", var4);
      var1.close();
   }
}
