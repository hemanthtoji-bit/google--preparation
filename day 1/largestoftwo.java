import java.util.Scanner;
public class lo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("The first number is greater");
        }
        else{
            System.out.println("The second number is greater");
        }

    }
}
