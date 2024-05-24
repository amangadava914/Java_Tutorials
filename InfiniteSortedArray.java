
// Amazon Interview Question :- Find the position of an element in a sorted array of infinite numbers?
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

import java.util.Scanner;
public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.print("Enter the target element :");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr , int target){
        // first find the range of the array
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1; // this is my new start
            // double the box
            end = end + (end - start + 1) * 2; // end = previous end + sizeOfPreviousBox * 2
            start = temp;
        }
        return infinitesortedarray(arr,target,start,end);
    }

    static int infinitesortedarray(int[] arr , int target , int start , int end){
        while (start <= end){

            int mid = start+(end-start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
