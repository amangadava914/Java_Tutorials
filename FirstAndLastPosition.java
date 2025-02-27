public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
        public int[] searchRange(int[] arr, int target){
            int[] ans = {-1,-1};
            // check for first occurrence of target first
          /*  int start = search(arr,target,true);
            int end = search(arr,target,false);

            arr[0] = start;
            arr[1] = end;

            return ans;*/

            arr[0] = search(arr,target,true);
            if (arr[0] != -1){
                ans[1] = search(arr,target,false);
            }
            return ans;
    }
    //this function just returns the index value of
    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
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
                // potential answer found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
