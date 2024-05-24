
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number of Rows Do You Wants to Print :");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
              System.out.print("*");
            }
           System.out.println();
        }
    }
}
