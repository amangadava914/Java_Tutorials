
/*एक पैलिंड्रोमिक संख्या (जिसे अंक पैलिंड्रोम या न्यूमेरिक पैलिंड्रोम के रूप में भी जाना जाता है) एक संख्या है (जैसे 16461)
 जो अपने अंकों को उलटने पर समान रहती है। दूसरे शब्दों में, इसमें ऊर्ध्वाधर अक्ष पर परावर्तक सममिति होती है।
 */

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
             System.out.println("Enter A Number :");
             Scanner sc = new Scanner(System.in);
             int num = sc.nextInt();
             int temp = num;
             int rev = 0,rem;
             while (temp != 0){
                 rem = temp%10;
                 rev = rev*10+rem;
                 temp = temp/10;
             }
             if (num == rev){
                 System.out.println(num+" : The Number IS A Palindrome Number");
             }
             else {
                 System.out.println(num+" :The Number IS Not A Palindrome Number");
             }
    }
}
