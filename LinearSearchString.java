
import java.util.Scanner;

/*
public class LinearSearchString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Item you wants to Search :");
        String item = sc.next();
        String arr[] = {"Aman","Nivesh","Kundan","Shailendra","Vipin","Madhukar","Kunal"};
        int temp = 0;
        for (int i = 0;i < arr.length;i++){
            if (arr[i].equals(item)){
                System.out.println("The String Present In The Given Array at Index :"+i);
                temp = temp+1;
            }
//            else {
//                System.out.println("The String Is Not Present in the Array");
//            }
        }
        if (temp == 0){
            System.out.println("The String Is Not Present in the Array");
        }
    }
}*/

/*
// using function
public class LinearSearchString {

    public static void main(String[] args) {
        String Name = "AmanLovePooja";
        char target = 'L';
        System.out.println(linearsearch2(Name, target));
    }
    static boolean linearsearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }

        //using foreach loop
        for (char ch: str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
*/


// taking user input
/*
public class LinearSearchString {

    public static void main(String[] args) {
        String Name = "AmanLovePooja";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Item you wants to Search :");
        char target = sc.next().charAt(0);
        System.out.println(linearsearch2(Name, target));
    }

    static boolean linearsearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }

        //using foreach loop
        for (char ch: str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
*/


// Search in range
public class LinearSearchString {

    public static void main(String[] args) {
        String Name = "AmanLovePooja";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Item you wants to Search :");
        char target = sc.next().charAt(0);
        System.out.println(linearsearch2(Name, target));
    }
    static boolean linearsearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}