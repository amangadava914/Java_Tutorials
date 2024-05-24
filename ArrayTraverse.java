

//Array Traversal by using while loop

//public class ArrayTraverse {
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,50,60,70,80,90,100};
//       // int[][] arr = {{10,20,30},{40,50,60,70}};
//        for (int i = 0; i < arr.length; i++) {
//            //for (int j = 0; j <arr[i].length ; j++) {
//            System.out.println("The Given Array Traversal is :"+arr[i]);
//                //System.out.println("The Given Array Traversal is :"+arr[i][j]);
//            }
//           // System.out.println("The Given Array Traversal is :"+arr[i]);
//       // }
//    }
//}


//Array Traversal by using for each loop
// public class ArrayTraverse {
//    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for(int i:arr){
//            System.out.println("Array Traversal by using for-each Loop :"+i);
//        }
//    }
//}


//Array Traversal By Using While-Loop
//public class ArrayTraverse {
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,50,60,70,80,90,100};
//        int i = 0;
//        while(i<arr.length) {
//            System.out.println("Array Traversal by using While Loop :"+arr[i]);
//            i++;
//        }
//    }
//}


//Array Traversal by using do-while loop
public class ArrayTraverse {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i = 0;
        do {
            System.out.println("Array traversal By Using do-while Loop :"+arr[i]);
            i++;
        }while(i < arr.length);
    }
}

