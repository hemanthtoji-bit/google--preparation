import java.util.Scanner;
public class countchar{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            int count=0;
           char[] arr=name.toCharArray();
              for(int i=0;i<arr.length;i++){
                 if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                      count++;
                 }
                }
            System.out.println("The number of vowels in the string is: "+count);



    }
}
