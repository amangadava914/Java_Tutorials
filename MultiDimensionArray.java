
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] =new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =in.nextInt();
            }
        }

        //Output

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //Output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //Output
//        for (int[] a: arr) {
//            System.out.println(Arrays.toString(a));
//        }
    }
}
