import java.util.Scanner;

public class Program25_VolumeConstructors {
   double vol;

   public Program25_VolumeConstructors(double var1) {
      this.vol = var1;
   }

   public Program25_VolumeConstructors(double var1, double var3) {
      this.vol = var1 * var3;
   }

   public Program25_VolumeConstructors(double var1, double var3, double var5) {
      this.vol = var1 * var3 * var5;
   }

   public double getVolume() {
      return this.vol;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Choose constructor: 1(one arg),2(two arg),3(three arg):");
      int var2 = var1.nextInt();
      Program25_VolumeConstructors var3;
      if (var2 == 1) {
         System.out.print("Enter value: ");
         var3 = new Program25_VolumeConstructors(var1.nextDouble());
      } else if (var2 == 2) {
         System.out.print("Enter l and b: ");
         var3 = new Program25_VolumeConstructors(var1.nextDouble(), var1.nextDouble());
      } else {
         System.out.print("Enter l b h: ");
         var3 = new Program25_VolumeConstructors(var1.nextDouble(), var1.nextDouble(), var1.nextDouble());
      }

      System.out.println("Result (vol/area/value) = " + var3.getVolume());
      var1.close();
   }
}
