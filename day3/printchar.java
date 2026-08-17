// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class printchar{
  public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        String name=sc.next();
        char[] arr=name.toCharArray();
    for(char c : arr){
      System.out.println(c);
  }

  }

}
