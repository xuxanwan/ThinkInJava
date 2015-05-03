package holding;

//: holding/AddingGroups.java
// Adding groups of elements to Collection objects.
import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        //构造函数传入初始化
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        // Runs significantly faster, but you can't
        // construct a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        System.out.println(collection);
        // Produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        List<Integer> list1 = new ArrayList<Integer>(list);
        System.out.println(list1);
        list1.set(1, 99); // OK -- modify an element
        System.out.println(list1);
        list1.add(21); // Runtime error because the
        // underlying array cannot be resized.
        System.out.println(list1);
    }
} // /:~
