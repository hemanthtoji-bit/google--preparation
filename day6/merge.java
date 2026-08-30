import java.util.Scanner;
public class merge{
  static void conquer(int arr[],int low,int mid,int high){
          int merged[]=new int[arr.length];
          int idx1=low;
          int idx2=mid+1;
    int x=0;
          while(idx1<=mid&&idx2<=high){
              if(arr[idx1]<arAr[idx2){
                    merged[x++]=arr[idx1++];
              }
            else{
                    merged[x++]=arr[idx2++];
            }
          }
while(idx1<=mid){
     

                    merged[x++]=arr[idx1++];
            
}
    while(idx2<=high){
     

                    merged[x++]=arr[idx2++];
            
}
    for(int i=low,j=0;i<high;i++,j++){

    arr[i]=merged[j];
    }
 
    
    
        
  }
        static void divide(int arr[],int low,int high){
                  if(low>=high){
                    return;
                  }
          mid=low+(high-low)/2;
          divide(arr,low,mid);
          divide(arr,mid+1,high);
          conquer(arr,low,mid,high);
          
          
        }
  
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
    }
    divide(a,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
          System.out.println(a[i]);
    }
    
      }
    
}
