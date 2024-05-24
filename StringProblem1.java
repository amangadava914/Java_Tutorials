
import java.util.*;
public class StringProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String is :");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("The String is :"+sb);
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i; // 5-1-0 = 4

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.print("And The Reverse of a String is : "+sb);
    }
}
