// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class smallofarr {
   public smallofarr() {
   }

   public static void main(String[] var0) {
      System.out.println("Enter the size of the array");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("enter the elements of the array");

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = var1.nextInt();
      }

      int var6 = var3[0];

      for(int var5 = 0; var5 < var3.length; ++var5) {
         if (var3[var5] < var6) {
            var6 = var3[var5];
         }
      }

      System.out.println("The smallest element of the array is: " + var6);
   }
}
