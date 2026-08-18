import java.util.Scanner;
public class arrsum {
      static int arraysum(int[] arr,int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
      }

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
      }
        int result=arraysum(arr,size);
        System.out.println("The sum of the array is: " + result);



    
}
}
