
// Q1 :- Print Numbers from 10 to 1 ?
/*
public class Recursion1 {
    public static void PrintNumb(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PrintNumb(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        PrintNumb(n); // n = 10
    }
}
*/


// Q1 :- Print Numbers from 1 to 10?
/*
public class Recursion1{
    public static void PrintNumb(int n){
        if (n == 11) {
            return;
        }
        System.out.println(n);
        PrintNumb(n+1);
    }
    public static void main(String[] args) {
        int n = 0;
        PrintNumb(n);
    }
}
*/


// Q3 :- Print Sum of First N Natural Numbers.
public class Recursion1 {
    public static void PrintSum(int i, int n, int sum){
        if (i == n) {
            sum += i;
            System.out.println("The Sum of First N Natural Number Is :- "+sum);
            return;
        }
        sum += i;
        PrintSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        PrintSum(1,10,0);
    }
}