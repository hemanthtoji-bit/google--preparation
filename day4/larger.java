import java.util.Scanner;
public class larger {
    static int findlarger(int[] arr,int size){
    
        int max=arr[0];
         for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         }
         return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=findlarger(arr,size);
        System.out.println("The largest number is: " + result);

}
}
