
/*
*************************** We divide modifiers into two groups **********************************
Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality


Access Modifier :-
* public :-	The code is accessible for all classes
* private :- The code is only accessible within the declared class
* default :- The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
* protected :- The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter

Non-Access Modifier :-
For classes, you can use either final or abstract:
* final :- The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)
* abstract :-	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)

For attributes and methods, you can use the one of the following:
Modifier	Description
final :	    Attributes and methods cannot be overridden/modified
static :-   Attributes and methods belongs to the class, rather than an object
abstract :-	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient :- Attributes and methods are skipped when serializing the object containing them
synchronized :-	Methods can only be accessed by one thread at a time
volatile :-	The value of an attribute is not cached thread-locally, and is always read from the "main memory"
 */

public class AccessModifier {
    public static void main(String[] args) {

        /*
        //Protected :- The protected keyword is an access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses.
        class Person {
         protected String fname = "John";
         protected String lname = "Doe";
         protected String email = "john@doe.com";
         protected int age = 24;
       }
       class Student extends Person {
         private int graduationYear = 2018;

       public static void main(String[] args) {
         Student myObj = new Student();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Email: " + myObj.email);
         System.out.println("Age: " + myObj.age);
         System.out.println("Graduation Year: " + myObj.graduationYear);
         }
       }
         */

/*
        // Public :- The public keyword is an access modifier used for classes, attributes, methods and constructors, making them accessible by any other class.
        public class Main {
          public String fname = "John";
          public String lname = "Doe";
          public String email = "john@doe.com";
          public int age = 24;
        }
        class Second {
            public static void main(String[] args) {
                Main myObj = new Main();
                System.out.println("Name: " + myObj.fname + " " + myObj.lname);
                System.out.println("Email: " + myObj.email);
                System.out.println("Age: " + myObj.age);
            }
        }
*/

        /*
        // Private :- The private keyword is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.
         public class Main {
           private String fname = "John";
           private String lname = "Doe";
           private String email = "john@doe.com";
           private int age = 24;

        public static void main(String[] args) {
           Main myObj = new Main();
           System.out.println("Name: " + myObj.fname + " " + myObj.lname);
           System.out.println("Email: " + myObj.email);
           System.out.println("Age: " + myObj.age);
  }
}
         */
    }
}
