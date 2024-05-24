
/*
Bubble Sort -> Bubble Sort, also referred to as sinking sort, is a comparison based algorithm is that comparing
each pair of adjacent items and swapping them if they are in wrong order.The pass through the list is repeated
until no swaps are needed, which indicates that the list is sorted.
*/

// public class BubbleSort {
//    public static void main(String[] args) {
//      int a[] = {36,29,19,12,5};
//      int temp;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length-1; j++) {
//                if (a[j] > a[j+1]){
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("The Sorted Array Is :"+a[i]);
//        }
//    }
//}


// Another
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {36,29,19,12,5};
        int temp;
        // first for loop is a number of rounds
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            // Second for loop compare the elements
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("The Sorted Array Is :"+a[i]);
        }
    }
}

// O(1) time it's consume