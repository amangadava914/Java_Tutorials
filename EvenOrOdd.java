
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[]) {
        System.out.print("Enter The Number :");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if (no % 2 == 0){
            System.out.println("The Given No Is Even");
        }
        else {
            System.out.println("The Given No Is Odd");
        }
    }
}