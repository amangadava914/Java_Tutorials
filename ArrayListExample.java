
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
       /* System.out.println(list.contains(50)); // Because of list contains 50
        System.out.println(list.contains(100)); // Because of ArrayList Does not contain 100
        */
        System.out.println(list);
        list.set(0,100);
        list.remove(2);
        System.out.println(list);
    }
}
