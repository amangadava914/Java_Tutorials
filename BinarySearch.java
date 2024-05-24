
import java.util.Scanner;

/*
public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number you Want's to Search in given Array :");
        int srch = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid = (low+high)/2;
        while (low <= high) {
            if (arr[mid] == srch) {
                System.out.println("The Element Found At :" + mid + " Index");
                break;
            } else if (arr[mid] < srch) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high){
            System.out.println("Element Not Found");
        }
    }
}
*/

//using function
public class BinarySearch {

    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //int mid = (start+end)/2;
            int mid = start+(end-start)/2; //might be possible that (start+end)
            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-18,-5,-1,0,5,18,22,50,99,999,9999,99999};
        System.out.print("Enter the target element : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
       int ans = binarysearch(arr,target);
        System.out.println("The target element found at index : "+ ans);
    }
}