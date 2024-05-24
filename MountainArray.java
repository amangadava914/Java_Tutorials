

public class MountainArray {
    public static void main(String[] args) {

    }
    static int peakIndexInMountainArray(int[] arr) {
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
}
