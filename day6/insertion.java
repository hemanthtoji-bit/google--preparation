import java.util.Scanner;
public class insertion{
  static void sort(int a[],int size){
    for(int i=0;i<a.length;i++){
      int key=a[i];
     int j=i;
      while(j>0&&a[j-1]>key){

         a[j]=a[j-1];
        j--;
      }
      a[j]=key;
         
  }
  }
    public static void main(String[] args){
      int n;
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
      

  int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt();
     

  
    }
      sort(arr,n);
      for(int i=0;i<arr.length;i++){
                  System.out.println(arr[i]);
      }
    }




}
