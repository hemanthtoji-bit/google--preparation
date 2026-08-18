import java.util.Scanner;
public class evenodd {
    static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args){

     Scanner sc= new Scanner(System.in);
     int number=sc.nextInt();
    if(isEven(number)){
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
      
    }
}
}
    
    

