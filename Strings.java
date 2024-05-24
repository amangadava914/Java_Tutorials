//
//import java.util.*;
//public class Strings {
//    public static void main(String[] args) {
//        String Name = "AMAn";
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Name : ");
//       // String name = sc.next();   //Output is only Aman not Aman Gadava
//
//        String name = sc.nextLine();        // Poori line print krwana ke liye Line keyword ka use hoga //Output poori Aman gadava print hogi
//        System.out.println("Your Name is :"+name);
//    }
//}

//public class Strings{
//    public static void main(String[] args) {
//        //Concatenation
//        String Name = "Tony";
//        String LastName = "Stark";
//        String Add = Name + " "+LastName;
//        System.out.println("The Name is :"+Add);
//        System.out.println("The Length of String is :"+Add.length());
//
//        //chatAt :- Using .charAt() Function
//        System.out.println("Using charAt Function :");
//        for (int i = 0; i < Add.length(); i++) {
//            System.out.println(Add.charAt(i));
//        }
//    }
//}


/*
//Compare The String Using :- .compareTo(function)
public class Strings{
   public static void main(String[] args) {
       //Compare :- .compareTo() function check are these three conditions
       // s1 > s2 :- +ve value
       // s1 == s2 :- 0 Value
       // s1 < s2 :- -ve value
       String Name = "Aman";
       String LastName = "Aman";
       if (Name.compareTo(LastName) == 0) {
           //if (Name == LastName){
           System.out.println("Both String Are Equal");
       } else {
           System.out.println("Strings are Not Equal");
       }

       System.out.println();
       // Create two new String
       if (new String("Aman") == new String("Aman")){
           System.out.println("Both String Are Equal");
       } else {
           System.out.println("Strings are Not Equal");
       }
   }
}
*/



public class Strings{
    public static void main(String[] args) {
        // SubString
        String Sentance = "My Name is Tony";
        String sentance = "TonyStark";
        // substring(beg index , end index);
        String name = Sentance.substring(11,Sentance.length());
        String Name = sentance.substring(4);
        System.out.println(name);
        System.out.println(Name);

        // Very Important Point :- String Are Immutable because we can not change the string after creation firstly if we created a string in the memory so we could not change the string and could not modify the string
        }
    }



