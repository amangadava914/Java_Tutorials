
// Leetcode question Number :- 1095. Find in Mountain Array
//https://leetcode.com/problems/find-in-mountain-array/


public class peakInMountainArray {
    public static void main(String[] args) {

    }

    static int search(int[] arr , int target){
        int peak = peakInMountainArray(arr);
        int firstTry = OrderAgnosticsBinarySearch(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        return OrderAgnosticsBinarySearch(arr,target,peak+1,arr.length-1);
    }

     static int peakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                // we are in the decreasing part // this maybe ans, but check left // this is why end != mid -1
                end = mid;
            } else {
                // we are in the increasing part
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        return start; // or return end because both are equal
    }

    static int OrderAgnosticsBinarySearch(int[] arr , int target, int start ,int end) {

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
