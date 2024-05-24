
// An Array in java Without any name in Anonymous Array it is an array just for creating and using instantly
// Is array are both single dimensional array or multidimensional array
// array Without name
// Creating and Initialized in a single line
//it can be single or multidimensional
// it can be used only once
//it can be used as an argument and method


//Single Dimensional Anonymous Array
// public class AnonymousArray {
//    public static void main(String[] args) {
//        AnonymousArray.sum(new int[]{10,20,30});
//    }
//    static void sum(int[] num){
//        int total = 0;
//        for (int i:num) {
//            total = total+i;
//        }
//        System.out.println("The Sum of Anonymous Array Is :"+total);
//    }
//}


// Multi Dimensional Anonymous Array
public class AnonymousArray {
    public static void main(String[] args) {
        AnonymousArray.sum(new int[][]{{10,20,30},{40,50}});
    }
    static void sum(int[][] num){
        int total = 0;
        for (int ii[]:num) {
            for(int i:ii) {
                total = total + i;
            }
        }
        System.out.println("The Sum of Anonymous Array Is :"+total);
    }
}
