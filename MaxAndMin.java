
import java.util.Scanner;
//public class MaxAndMin {
//    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
//        int a[] = {5,9,1,3,7,0,6,8,10,4};
//        int max = a[0];
//        for (int i = 1;i<a.length;i++){
//            if (a[i] > max){
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum Element Is :"+max);
//    }
//}

public class MaxAndMin {
    public static void main(String[] args){
        int a[] = {5,9,1,3,7,0,6,8,10,4};
        int min = a[0];
        for (int i = 1;i<a.length;i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum Element Is :"+min);
    }
}
