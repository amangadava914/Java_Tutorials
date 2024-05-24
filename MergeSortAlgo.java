
/*
Merge Sort Algorithm :- Merge Sort is one of the most popular sorting Algorithm, and it is widely used technique.
It's time complexity is (i.e. T(n) = 2T(n/2)+n ) is better is compared to bubble sort ,Selection Sort and insertion Sort.
 */
public class MergeSortAlgo {

    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
          int[] inputArr = {48,36,13,52,19,94,21};
          MergeSortAlgo ms = new MergeSortAlgo();
          ms.sort(inputArr);

        for (int i:inputArr) {
            System.out.println(i+" ");
        }
    }
    public void sort(int inputArr[]){
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerindex,int higherindex){
        if(lowerindex<higherindex){
            int middle = lowerindex+(higherindex-lowerindex)/2;

            //It will sort the left side of an array
            divideArray(lowerindex,middle);

            //It will sort the right side of an array
            divideArray(middle+1,higherindex);

            mergeArray(lowerindex,middle,higherindex);
        }
    }
    public void mergeArray(int lowerindex,int middle,int higherindex){
        for (int i = lowerindex; i <= higherindex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerindex;
        int j = middle+1;
        int k = lowerindex;
        while(i<=middle && j<=higherindex){
            if (tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }
            else{
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<= middle){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
