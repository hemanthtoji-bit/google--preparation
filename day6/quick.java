import java.util.Scanner;
public class quick{
  static int partition(int a[],int high,int low){
      int i=low-1;
    int pivot=a[high];
    for(int j=low;j<high;j++){
          if(a[j]<pivot){
           i++;
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;


          }



    }
    i++;
    int temp=a[high];
    a[high]=a[i];
    a[i]=temp;
    return i;
    







  }
            static void quick(int a[],int low,int high){
              if(low<high){
              int piidx=partition(a,high,low);


                quick(a,low,piidx-1);
                quick(a,piidx+1,high);



              }







            }




   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
       int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
     }
     quick(arr,0,arr.length-1);
     for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
     }
   }













}
