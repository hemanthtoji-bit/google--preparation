import java.util.Scanner;

public class reverse {

    static String reversestring(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result = reversestring(str);

        System.out.println("The reversed string is: " + result);
    }
}
