import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        char[] arr=name.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

        }
    }

