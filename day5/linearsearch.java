import java.util.Scanner;
public class linear{
  statc int search(int arr[],int target){
              for(int i=0;i<arr.length;i++){
                    if(arr[i]==target){
                        return i;
                    }
              
              }
    return -1;

  }
  public static void main(String[] args){
            int a[]={1,2,3,4,5};
    Scanner sc=new Scanner(System.in);
             int target;
              target=sc.nextInt();
            int found=search(a,target);
    System.out.println(found);


  }
}
