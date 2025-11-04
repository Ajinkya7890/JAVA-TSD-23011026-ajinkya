
public class Program19_ReverseStringPredefined {
   public Program19_ReverseStringPredefined() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter string: ");
      String var2 = var1.nextLine();
      String var3 = (new StringBuilder(var2)).reverse().toString();
      System.out.println("Reversed: " + var3);
      var1.close();
   }
}
