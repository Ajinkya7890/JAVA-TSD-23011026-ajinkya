import java.util.Scanner;

public class Program04_SimpleInterest {
   public Program04_SimpleInterest() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Principal (P): ");
      double var2 = var1.nextDouble();
      System.out.print("Rate (R %): ");
      double var4 = var1.nextDouble();
      System.out.print("Time (T years): ");
      double var6 = var1.nextDouble();
      double var8 = var2 * var4 * var6 / 100.0;
      System.out.printf("Simple Interest = %.2f%n", var8);
      var1.close();
   }
}
