import java.util.Scanner;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {-99999,-9999,-999,-99,-9,9,99,999,9999,99999};// Ascending order
        // int[] arr = {99999,9999,999,99,9,-9,-99,-999,-9999,-99999}; // Descending order
        System.out.println("Enter the target element :");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = CeilingOfNumber(arr,target);
        System.out.println("The element found at Index :"+ans);
    }

    static int CeilingOfNumber(int[] arr , int target) {

        // return the index of smallest number >= target
        if (target > arr[arr.length -1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start+(end-start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
