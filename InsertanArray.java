public class InsertanArray {
    public static void main(String[] args) {
        int a[] = {10,20,25,40,50,60,70,80,90,100};
        int index_pos = 3;
        int element = 30;
        for (int i = a.length-1; i < index_pos-1; i--) {
            a[i] = a[i-1];
        }
       a[index_pos-1] = element;
        //or Index Position a[index_pos] = element;
        for (int i = 0; i < a.length; i++) {
            System.out.println("After Insertion :"+a[i]);
        }
    }
}
