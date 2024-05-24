/*
Selection Sort ->  The Selection Sort is a combination of Searching and Sorting. It Sorts an Array by repeatedly
 finding the minimum Element(Consider Ascending order) from unsorted part and putting it at the beginning.
 In every iteration of selection sort,the minimum element (considering ascending order) from the unsorted
 subArray is picked and moved to the sorted subArray.
 */
/*
The Algorithm maintains two subArray in the given Array
1 : The SubArray which is already sorted
2 : Remaining Array which is unsorted
 */


public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] a = {35,55,1,88,20,15};
        int min;
        int temp =0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[min]){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("The Sorted Array Is :"+a[i]);
        }
    }
}

 

/*
public class SortAscendingArray {

       public static void main(String[] args) {

       int arr [] = {38,52,9,18,6,62,13};

       Arrays.sort(arr);

       System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

  }
 }
 */
/* 
public class SelectionSortAlgo {
    public static void main(String[] args) {
        String[] a = {"Aman","Nivesh","Kundan","Shailendra","Madhukar","Vipin","Kunal"};
        int min;
        String temp = "";
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[i].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("The Sorted Array Is :"+a[i]);
        }
    }
}
*/