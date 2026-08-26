import java.util.Scanner;
public class selectionsort{
     static void sort(int a[],int n){
         for(int i=0;i<n-1;i++){
                  int mini=i;
           for(int j=i;j<n;j++){
                    if(a[j]<a[mini]){
                        mini=j;
                    }

           }
           int temp=a[i];
           a[i]=a[mini];
           a[mini]=temp;
         }

     
     }

  
  public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
                int arr[]=new int[n];
            for(int i=0;i<n;i++){
                   arr[i]=sc.nextInt();
            }

    sort( arr, n);
       for(int i=0;i<n;i++){
             System.out.println(arr[i]);
       }
                



      
     }

}










