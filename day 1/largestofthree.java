import java.util.Scanner;
public class lo3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("The first number is greater");
        }
        else if(b>c){
            System.out.println("The second number is greater");
        }
        else{
            System.out.println("The third number is greater");
        }

    }
}

