package _11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

//: holding/SimpleCollection.java

public class SimpleCollection {
public static void main(String[] args) {
  Collection<Integer> c = new ArrayList<Integer>();
  Collection<Integer> c1 = new HashSet<Integer>();  
  for(int i = 0; i < 10; i++)
    c.add(i); // Autoboxing
  for(Integer i : c)
    System.out.print(i + ", ");
  
  System.out.println();
  for(int i = 0; i < 10; i++)
	    c1.add(i); // Autoboxing
  for(Integer i : c1)
    System.out.print(i + ", ");
}
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
