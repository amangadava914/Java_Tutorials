
/*
The finally keyword is used to execute code (used with exceptions - try..catch statements) no matter if there is an exception or not.
 */
public class Finally {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
