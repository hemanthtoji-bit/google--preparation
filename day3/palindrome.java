import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String name=sc.next();
      StringBuilder reversed=new StringBuilder(name).reverse();

      if(reversed.toString().equals(name)){
        
          System.out.println("The string is a palindrome");
      }
      else{
          System.out.println("The string is not a palindrome"); 
      }
}
}
