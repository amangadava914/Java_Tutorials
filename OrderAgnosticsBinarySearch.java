
import java.util.Scanner;
public class OrderAgnosticsBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-99999,-9999,-999,-99,-9,9,99,999,9999,99999};// Ascending order
        //  int[] arr = {99999,9999,999,99,9,-9,-99,-999,-9999,-99999}; // Descending order
        System.out.println("Enter the target element :");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = OrderAgnosticsBinarySearch(arr,target);
        System.out.println("The element found at Index :"+ans);
    }

    static int OrderAgnosticsBinarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];
       //int mid = 0;
        while (start <= end) {
         int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
