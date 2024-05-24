import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
Throws :- The throws keyword indicates what exception type may be thrown by a method.
There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

 //Note : Throws Keyword Exception Handle nhi karta hain ye sirf exception indicate karta hain
 */
class ReadAndWrite {
    void ReadFile() throws FileNotFoundException {
        FileInputStream FIS = new FileInputStream("D:/abcd.txt");
        //Idhar Bhi Try Catch ka use kr skta hain
    }
    void SaveFile() throws FileNotFoundException {
        String Text = "This Is a Demo of Throws Keyword";
        FileOutputStream FOS = new FileOutputStream("D:/wxyz.txt");
        //Idhar Bhi Try Catch ka use kr skta hain
    }
}
public class ThrowsKeyword {
    public static void main(String[] args) {
        ReadAndWrite RAW = new ReadAndWrite();
        try {
            RAW.ReadFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        try {
            RAW.SaveFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Exception Handled");
    }
}
