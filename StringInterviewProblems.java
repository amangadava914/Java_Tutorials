
//Q1 :- Write a program to reverse a given string ?
/*
import java .util.Scanner;
public class StringInterviewProblems {
    public static void main(String[] args) {
        String rev = "";
        System.out.println("Enter a String do you want to reverse :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i =s.length()-1; i >= 0 ; i--) {
             rev = rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
*/


//Q2 :- Write a program to check a given string is Palindrome or not ?
/*
import java .util.Scanner;
public class StringInterviewProblems {
    public static void main(String[] args) {
        System.out.println("A program to check a given string is Palindrome or not!");
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev+s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("The String is Palindrome");
        }
        else {
            System.out.println("The String is not Palindrome");
        }
    }
}
*/

//Q3 :- Write a program to find maximum occurring character in given string ?
import java.util.*;
public class StringInterviewProblems {
    public static void main(String[] args) {
        System.out.println("*****To Find Maximum occurring character*****");
        //String s = "abbccc";
        System.out.println("Enter a String with ASCII Numbers :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s","");  //to replace space
        int[] arr = new int[256];
        for (int i = 0; i <= s.length()-1; i++) {
            arr[s.charAt(i)] = arr[s.charAt(i)]+1;
        }

        int max = -1;
        char c = ' ';
        for (int i = 0; i <= s.length()-1; i++) {
            if (max<arr[s.charAt(i)]) {
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println("Maximum repeated character is :"+c);
    }
}