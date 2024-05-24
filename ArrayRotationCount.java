
public class ArrayRotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(countRotations(arr));
//        System.out.println("Aman");
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

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
