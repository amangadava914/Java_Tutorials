import java.util.Arrays;
import java.util.*;
/*
public class LinearSearch {
    public static void main(String args[]){
        System.out.println("Enter The Item you wants to Search An Given Array :");
        Scanner Sc = new Scanner(System.in);
        int Item = Sc.nextInt();
        int arr[] = {10,9,8,7,6,5,4,3,2,1,0};
        int temp =0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == Item){
                System.out.println("The Item is Present At Index :"+i);
                temp = temp+1;
            }
        }
        if (temp == 0){
            System.out.println("This Item Is Not Found");
        }
    }
}
*/

//Using function to search an element
//public class LinearSearch {
//    static int linearsearch1(int[] arr,int target){
//        if (arr.length == 0){
//            return -1;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            //int element = arr[index];
//            if (arr[index] == target){
//                return index;
//            }
//        }
//        return -1;
//    }
//    public static void main(String args[]) {
//        int[] num = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5};
//        System.out.println("Enter the item you wants to search in the given Array :");
//        Scanner Sc = new Scanner(System.in);
//        int target = Sc.nextInt();
//        int ans = linearsearch1(num,target);
//        System.out.println("The target element found at index :"+ans);
//    }
//}

//*************************** Search in range ************************************************(in range of 1 to 6)
/*
public class LinearSearch {
    static int linearsearch1(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 1; index <= 6; index++) {  // (in range of 1 to 6)
            //int element = arr[index];
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] num = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5};
        System.out.println("Enter the item you wants to search in the given Array :");
        Scanner Sc = new Scanner(System.in);
        int target = Sc.nextInt();
        int ans = linearsearch1(num,target,1,6);
        System.out.println("The target element found at index :"+ans);
    }
}*/

/*
// Find the minimum element of the array?
public class LinearSearch {
    public static void main(String args[]) {
        int[] arr = {1, 15, 0, -99, 55, 100, -66, 87, 27, 74, -33, 49, -77};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int ans = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < ans){
                ans = arr[index];
            }
        }
        return ans;
    }
}*/


/*
// Search in 2D-Arrays
public class LinearSearch {
    public static void main(String args[]) {
        int[][] arr = {
                {1001, 99, 5528, 157},
                {645, 559, 448},
                {933, 2950, 51, 10, 111},
                {225, 333, 44, 95}
        };
        System.out.println("Enter the item you wants to search in the given Array :");
        Scanner Sc = new Scanner(System.in);
        int target = Sc.nextInt();
        int[] ans = linearsearch_2DArrays(arr, target); // format of return value [row,col]
        System.out.println(Arrays.toString(ans));
    }
    static int[] linearsearch_2DArrays(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
*/

//2D array search and return the maximum 2D array value
public class LinearSearch {
    public static void main(String args[]) {
        int[][] arr = {
                {1001, 99, 5528, 157},
                {645, 559, 448},
                {933, 2950, 51, 10, 111},
                {225, 333, 44, 95}
        };
        System.out.println("Enter the item you wants to search in the given Array :");
        Scanner Sc = new Scanner(System.in);
        int target = Sc.nextInt();
        int[] ans = linearsearch_2DArrays(arr, target); // format of return value [row,col]
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] linearsearch_2DArrays(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints: arr) {
            for (int anInt: ints) {
                if (anInt > max){
                    max = anInt;
                }
            }
        }
        return max;
    }
}