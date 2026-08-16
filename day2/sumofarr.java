import java.util.Scanner;
public class sumofarr{
    public static void main(String[] args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array is: "+sum);    


    }
}
