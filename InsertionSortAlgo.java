
/*
Insertion Sort Algorithm :- Insertion Sort is a Simple sorting Algorithm that works the way we sort playing cards
in our hands. We choose one card and insert it in its position(ascending or descending).
*/

public class InsertionSortAlgo {
    public static void main(String[] args) {
          int a[] = {5,1,6,2,4,3};
          int temp,j;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            while(j>0 && a[j-1] > temp){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
