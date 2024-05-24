/*
import java.util.Scanner;
public class LargeofTwo {
    public static void main(String args[]){
        System.out.println("Enter A First  Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter A Second  Number :");
        int b = sc.nextInt();
        System.out.println("Enter A Third  Number :");
        int c = sc.nextInt();
        if (a>b && a>b){
            System.out.println("A is a Greater Number");
        }
        else if (b>a && b>c){
            System.out.println("B is a Greater Number");
        }
        else {
            System.out.println("C is a Greater Number");
        }
    }
}
*/

import java.sql.SQLOutput;
import java.util.Scanner;
public class LargeofTwo {
    public static void main(String args[]){
        System.out.println("Enter A First  Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter A Second  Number :");
        int b = sc.nextInt();
        System.out.println("Enter A Third  Number :");
        int c = sc.nextInt();
        if (a>b){
            if (a>c) {
                System.out.println("A is a Greater Number");
            }
            else {
                System.out.println("C is a Greater Number");
            }
        }
        else if (b>c){
            System.out.println("B is a Greater Number");
        }
        else {
            System.out.println("C is a Greater Number");
        }
    }
}
