//Before implementing any algorithm, we should be thorough with taking inputs. Here, we will learn how to read inputs.
//        You are given five inputs: a(integer), b(float ), c(long), d(byte), s(string) respectively. You need to take the input and print a, b, c, d and s in new line.
//        Read : Java I/O
//
//        Example 1:
//
//        Input:
//        5
//        2.5
//        6546854
//        120
//        geek for geeks
//
//        Output:
//        5
//        2.5
//        6546854
//        120
//        geek for geeks

/*static void IOFunction(){
        Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 while(t-- > 0){
     System.out.println(sc.nextInt());
     System.out.println(sc.nextFloat());
     System.out.println(sc.nextLong());
     System.out.println(sc.nextByte());
     System.out.println(sc.nextLine()+sc.nextLine());
 }*/
/* int a=sc.nextInt();
		    float b=sc.nextFloat();
		    long c=sc.nextLong();
		    byte d=sc.nextByte();
		    sc.nextLine();
		    String s=sc.nextLine();
		    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+s+"\n");*/
/*
 int a=sc.nextInt();
		    float b=sc.nextFloat();
		    long c=sc.nextLong();
		    byte d=sc.nextByte();
		    sc.nextLine();
		    String s=sc.nextLine();
		    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+s+"\n");
*/

/*
class Geeks{
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 while(t-- > 0){
     int a = sc.nextInt();
     System.out.println(a);
     float b = sc.nextFloat();
     System.out.println(b);
     long c = sc.nextLong();
     System.out.println(c);
     int d = sc.nextInt();
     sc.nextLine();
     System.out.println(d);
     String e = sc.nextLine();
     System.out.println(e);
 }
    }
}
*/
import java.util.Scanner;
public class GFG_Problems {

        // Function to take input using Scanner class
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t --> 0){

                // Your code here
                int a = sc.nextInt();
                sc.nextLine();
                System.out.println(" "+a);

                float b = sc.nextFloat();
                sc.nextLine();
                System.out.println(" "+b);

                long c = sc.nextLong();
                sc.nextLine();
                System.out.println(" "+c);

                byte d = sc.nextByte();
                sc.nextLine();
                System.out.println(" "+d);

                String e = sc.nextLine();
                System.out.print(" "+e);
            }
            System.out.println("GFG");
        }
}
/*
class Geeks{

   // Function to take input using Scanner class
   static void IOFunction(){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
 int a = sc.nextInt();
 float b = sc.nextFloat();
 long c = sc.nextLong();
 byte d = sc.nextByte();
 sc.nextLine();
 String s = sc.nextLine();
 while(t-- > 0){

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
       System.out.println(d);
       System.out.println(s);
 }

   }

}
 */