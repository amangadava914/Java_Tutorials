
import java.util.Arrays;
import java.util.Scanner;
// Syntax :- datatype[] variableName = new datatype[size]
public class Array {
    public static void main(String []arg){
//         int[] ros;
//         ros = new int[];
//       int arr[] = new int[5];
//         System.out.println(ros[0]);
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];
         //Array of Primitives
         arr[0] = 10;
         arr[1] = 20;
         arr[2] = 30;
         arr[3] = 40;
         arr[4] = 50;
         System.out.print(arr[3]);
         for (int i = 0; i <arr.length; i++){
             arr[i] = sc.nextInt();
         }
//         for (int j = 0;j<arr.length;j++){
//             System.out.println(arr[j]+" ");
//         }
        System.out.println(Arrays.toString(arr));

    }
}
