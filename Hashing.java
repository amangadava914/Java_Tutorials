import java.util.HashSet;
import java.util.Iterator;
//HashSet Contains only unique element does not contains duplicate element
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert an element in HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        System.out.println(set);
        //Print the size of HashSet
        System.out.println("The Size of HashSet is :"+set.size());

        // Search an Element in HashSet
        if (set.contains(1)){
            System.out.println("HashSet Contains 1");
        }
        if (!set.contains(10)){
            System.out.println("HashSet Does Not Contains 6");
        }


        // Search an Element in HashSet
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("HashSet does not contain 1 - Because of we deleted the element of 1");
        }
        System.out.println("After the Deletion The Size of HashSet is :"+set.size());
        System.out.println("After the deletion HashSet is :"+set);

        //Iterator
        Iterator IT = set.iterator();
        while(IT.hasNext()){
            System.out.println(IT.next());
        }
    }
}
