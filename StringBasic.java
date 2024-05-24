
//https://www.youtube.com/watch?v=i7vYjvJOIiw&list=PLlhM4lkb2sEh8AARH5oEivYOrMgaVsPFb&index=5&ab_channel=SmartProgramming

// (==) operator ka use String reference comparesion and Address Comparesion main hota hain.
//Reference means S1,S2 (Reference are those where we can refer a value or points our value)
//.equals method string main object ke content ko check krne ke liye use hota hain

//Note :- String Buffer and String Builder Mutable object create karte hain aur String Immutable object create krta hain

/*
public class StringBasic {
    public static void main(String[] args) {
           String S1 = new String("AMAN"); //two object created in this situation
           String S2 = new String("AMAN");
           System.out.println(S1==S2); //The Answer is false Because of S1 and S2 are a different reference variables which points the same values

           String S3 = "Aman"; // one object created in this situation
           String S4 = "Aman";
           System.out.println(S3==S4); // The Answer is true because of different reference variables points the same value

           System.out.println(S1.equals(S2));

           String S5 = new String
    }
}
*/

/*
// Equals method are has the different meanings in Object class and the String class
class Object{
    public boolean equals(Object obj){
        return(this == obj);
    }
}

class String extends Object {

    @overide
    public boolean equals(Object obj){
    //Statements
    }
}
 */


import java.sql.SQLOutput;
import java.util.Locale;

public class StringBasic{
    public static void main(String[] args) {

        StringBuffer SB = new StringBuffer("Aman");
        String S1 = new String(SB);
        System.out.println(S1);

        StringBuilder SBD = new StringBuilder("Gadava");
        String S2 = new String(SBD);
        System.out.println(S2);

        byte[] b = {101,102,103,104,105};
        String S3 = new String(b);
        System.out.println(S3);

        char[] c = {'a' , 'b' , 'c' , 'd'};
        String S4 = new String(c);
        System.out.println(S4);

        char[] c1 = new char[]{'a' , 'b' , 'c' , 'd'}; //char array(char[]) is better to store passward then String  <-- Interview Question
        String S5 = new String("ABC");
        System.out.println("c1 :- "+c1);
        System.out.println("S5 :- "+S5);

        //String methods :- .length() , .isEmpty() , .trim()
        String Name = "abcde";
        String Name1 = "  aman  pooja     ";
        String name = "";
        String name2 = "       ";
        String Email = "abcde@gmail.com";
        String Passward = "abcde1234";
        System.out.println(Name.length()); //.length() count the no. of characters into the String and return a integer value



        System.out.println(Name.isEmpty()); //.isEmpty() return a boolean value and check the string is empty or not
        boolean b1 = name.isEmpty();
        if (b1){ //or if(name.isEmpty()) or if(b1 == 0)
            System.out.println("Name is Empty");
        }
        else{
            System.out.println("Name is not Empty");
        }


        System.out.println(Name1);
        System.out.println(Name1.trim()); //.trim() method removes the space(String literals ke aage or peeche ka space ko remove kr deta hain lekin 2 literals ka beech ka space ko remove nhi krta hain) or ye String hee return krta hain
        if (name2.trim().length() == 0){
            System.out.println("String is empty");
        }
        else {
            System.out.println("String is not empty");
        }


        if (Name1.trim().length() == 0) { //isme (Name1.length().trim() ) likhenge toh error show karega because .length() method integer return krta hain or .trim() method String
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }


        //.compareTo() method lexicographically two string value ko compare krta hain or .compareTo() method integer value return karta hain
        String S6 = "a"; // a ki decimal value 65 hoti hain
        String S7 = "A"; // Capital A ki decimal value 97 hoti hain
        //.compareTo() method S7 main se S6 Substract kr deta hain if (S6 = S7 toh 0 return karega if S6 > S7 toh positive integer return karaga or if S6 < S7 to negative integer return karega
        System.out.println(S6.compareTo(S7));

         //.compareTo() method ka use length calculate krna main bhi hota hain
        String Name3 = "AMAN";
        String Name4 = ""; //Agar dusri string empty ho tabhi length claculate krta hain
        System.out.println(Name3.compareTo(Name4));

        //.compareToIgnoreCase method lexicographically two string value ko compare krta hain lekin uppercase and lowercase ko ignore karta hain
        String Name5 = "AMAN";
        String Name6 = "aman";
        System.out.println(Name5.compareToIgnoreCase(Name6));

        //Concatenate by using (+) operator
        System.out.println(Name5+Name6);


        //Concatenation method (.concat())
        System.out.println(Name5.concat(Name6));

        //.join() method
        System.out.println(String.join(",", Name5,Name6));
        System.out.println(String.join(";", Name5,Name6));
        System.out.println(String.join(":", Name5,Name6,S6));
        System.out.println(String.join("xxxxxx", Name5,Name6,S6,S7));

        //.subSequence() method or .subString() method
        String s = "This is a demo of .subSequence() method";
        System.out.println(s.subSequence(3,10));
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,11));
        //System.out.println(s.substring(3,-1)); // toh ye StringIndexOutOfBoundsException throw karega

        //.replace() method , .replaceFirst() method , .replaceAll() method
        String demo = "This is Demo";
        System.out.println(demo.replace("is","was"));
        System.out.println(demo.replaceFirst("is","was"));
        System.out.println(demo.replaceAll("is(.)","was"));
        System.out.println(demo.replaceAll("is (.*)","was"));


        //String Searching Method
        String srh = "Aman loves with Pooja";
        System.out.println(srh.indexOf("love"));
        System.out.println(srh.indexOf("hate"));
        System.out.println(srh.lastIndexOf("A"));
        System.out.println(srh.lastIndexOf("ja"));
        System.out.println(srh.charAt(4)); //4th index per space hain
        System.out.println(srh.charAt(16));
        System.out.println(srh.contains("Pooja"));
        System.out.println(srh.startsWith("Pooja"));
        System.out.println(srh.endsWith("Pooja"));


        //String Conversion
        //case conversion method :- .toUpperCase() and .toLowerCase()
        System.out.println(srh.toUpperCase());
        System.out.println(srh.toLowerCase());

        //String Type Conversion method :- .valueOf() and .toCharArray()
        int A = 10 , B = 20;
        int C = A+B;
        System.out.println(C);
        String s1 = String.valueOf(A);
        String s2 = String.valueOf(B);
        System.out.println(s1+s2);

        char[] arr = srh.toCharArray();
        System.out.println(arr);


        //
    }
}