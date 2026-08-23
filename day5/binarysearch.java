import java.util.Scanner;
public class binarysearch{
  static int binarysearch(int arr[],int low,int high,int target){

  while(low<=high){
    int mid=(low+high)/2;
         if(target==arr[mid]){
           return mid;
         }
         else if(target<arr[mid]){
           high=mid-1;
         }
    else {
          low=mid+1;
    }
  }
  return -1;

}
public static void main(String[] args){
int arr[]={1,2,3,4,5};
  int low=0;
  int high=arr.length-1;
  int target;
  Scanner sc=new Scanner(System.in);
  target=sc.nextInt();
  int found=binarysearch(arr,low,high,target);
  System.out.println(found);
    


}
}




  
