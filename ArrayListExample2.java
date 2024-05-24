
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        //Input
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        //Get Item at any Index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i)); //Pass Index here,list [index] Syntax will not work here
        }
//        System.out.println(list);
    }
}
