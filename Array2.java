import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int num :arr){ //for every element in array ,print the element
            System.out.print(num+" "); // here num represents element of the array
        }
//        System.out.println(Arrays.toString(arr));// There are another ways to print an array which is the best one
    }
}
