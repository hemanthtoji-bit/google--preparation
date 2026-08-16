// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class countevenodd {
   public countevenodd() {
   }

   public static void main(String[] var0) {
      int var1 = 0;
      int var2 = 0;
      Scanner var3 = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int var4 = var3.nextInt();
      int[] var5 = new int[var4];
      System.out.println("Enter the elements of the array");

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = var3.nextInt();
      }

      for(int var7 = 0; var7 < var5.length; ++var7) {
         if (var5[var7] % 2 == 0) {
            ++var1;
         } else {
            ++var2;
         }
      }

      System.out.println("The number of even numbers in the array is: " + var1);
      System.out.println("The number of odd numbers in the array is: " + var2);
   }
}
