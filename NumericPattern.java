
import java.util.Scanner;
public class NumericPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number of Rows Do You Wants to Print :");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
//                System.out.print(j);
            }
            System.out.println();
        }
    }
}
