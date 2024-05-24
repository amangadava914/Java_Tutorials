
/*
import java.util.Arrays;
import java.util.Scanner;
public class TwoD_Array {
    public static void main(String[] args) {


        int[][] arr2D = {
                {1, 2, 3, 4}, // 0th index
                {5, 6}, // 1st index
                {7, 8, 9}  // 2nd index
        };

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}
*/


import java.util.Arrays;
import java.util.Scanner;
public class TwoD_Array {
    public static void main(String[] args) {
        int [][] arr2D = {
                {1,2,3,4}, // 0th index
                {5,6}, // 1st index
                {7,8,9}  // 2nd index
        };
                                      //int[][] arr =  new int[3][4];
                                     //System.out.println(arr.length); // print no of rows :- 3
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
        //Another way to print output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // Another way to print the output
//        for (int[] a: arr) {
//            System.out.println(Arrays.toString(a));
//        }

    }
}
