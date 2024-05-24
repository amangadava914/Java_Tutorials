/*
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int binarySearch(int[] nums,int target){
        int pivot = findPivot(nums);

        //if you did not find a pivot, it means array is not rotated
        if (pivot == -1){
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length - 1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot + 1, nums.length - 1);
    }

    // this will not work in duplicates elements
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // There are the 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target,int start , int end){
         while (start <= end){
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
}*/


// ****************************************************************************************************************************** //
// Rotated array with duplicates elements
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 8, 2, 2, 2, 2};
        System.out.println(findPivot(arr));
    }

    static int binarySearch(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you did not find a pivot, it means array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }


    // use this for duplicates array
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // There are the 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
           // if elements of start ,middle and end are equal then just skip the duplicates elements
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // what if these elements at start and end are the pivot ??
                // check if start is pivot ?
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check if end is pivot ?
                if (arr[end] < arr[end - 1]){
                    return end;
                }
                end++;
            }
            // left side is sorted,so pivot should be right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else{
                end = end - 1;
            }
        }
        return -1;
    }

    // normal binary search
    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2; //might be possible that (start+end)
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}