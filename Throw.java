
/*
Throw Keyword :-
The throw keyword is used to create a custom error.
The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
The exception type is often used together with a custom method, like in the example above.

Differences between throw and throws:-
throw	                                                         throws
Used to throw an exception for a method	      Used to indicate what exception type may be thrown by a method
Cannot throw multiple exceptions	          Can declare multiple exceptions
Syntax:                                       Syntax:
throw is followed by an object (new type)     throws is followed by a class
used inside the method                        and used with the method signature

 */

//Note :- Throw Keyword used in Inside the method and Throws Keyword used in with method
//Note :- Throw keyword used in unchecked exception and throws keyword used in checked exception
import java.util.Scanner;
/*
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        if (age < 18) {
            throw new YoungerAgeException("You are not eligible to vote ");
        }
        else {
            System.out.println("You can Vote");
        }
        System.out.print("If Exception is caught then print me");
    }
}

 */

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible to vote ");
            } else {
                System.out.println("You can Vote");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("If Exception is caught then print me");
    }
}