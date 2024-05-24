
//import java.util.*;
//public class DeleteArrayElement {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50,60,70,80,90,100};
//        Scanner DE = new Scanner(System.in);
//        System.out.println("Enter The Element do you want to delete :");
//        int delete = DE.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (delete == arr[i]){
//                for (int j = i; j < arr.length; j++) {
//                    try {
//                        arr[j] = arr[j+1];
//                    }
//                   catch(ArrayIndexOutOfBoundsException e){
//                       System.out.println("Exception Caught");
//                   }
//                }
//                break;
//            }
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            System.out.println("After the Deletion :"+arr[i]);
//        }
//    }
//}



//----------------------------------------------------OR------------------------------------------------------
import java.util.*;
public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Scanner DE = new Scanner(System.in);
        System.out.print("Enter The Element do you want to delete : ");
        int delete = DE.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (delete == arr[i]){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                count = count+1;
                break;
            }
        }
        if (count == 0){
            System.out.println("Given Element Not Found");
        }
        else {
            System.out.println("Element Deleted Successfully");
            for (int i = 0; i < arr.length-1; i++) {
                System.out.println("After the Deletion : "+arr[i]);
                System.out.println("Length of The Array is : "+arr[i]);
            }
        }
    }
}
