import java.util.Scanner;

public class Program02 {
   public Program02() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter second number: ");
      double var4 = var1.nextDouble();
      System.out.print("Enter operation (+ - * /): ");
      char var6 = var1.next().charAt(0);
      double var7 = 0.0;
      boolean var9 = true;
      switch (var6) {
         case '*':
            var7 = var2 * var4;
            break;
         case '+':
            var7 = var2 + var4;
            break;
         case ',':
         case '.':
         default:
            System.out.println("Invalid operator.");
            var9 = false;
            break;
         case '-':
            var7 = var2 - var4;
            break;
         case '/':
            if (var4 == 0.0) {
               System.out.println("Cannot divide by zero.");
               var9 = false;
            } else {
               var7 = var2 / var4;
            }
      }

      if (var9) {
         System.out.println("Result: " + var7);
      }

      var1.close();
   }
}
