package _11;

//: holding/ListFeatures.java
import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.*;

public class ListFeaturesInteger {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Integer> pets = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    print("1: " + pets);
    Integer eight = new Integer(8);
    pets.add(eight); // Automatically resizes
    print("2: " + pets);
    print("3: " + pets.contains(eight));
    pets.remove(eight); // Remove by object
    
    Integer p = pets.get(2);
    print("4: " +  p + " " + pets.indexOf(p));
    
    Integer five = new Integer(5);
    Integer five1 = new Integer(5);
   
    print("5: "+ pets.indexOf(five));  //找得到，而对于对象找不到,Integer能equals的到
    print("6: "+ pets.remove(five));
    
    print("7: " + pets.remove(p));
    print("8: " + pets);
    
    pets.add(3, new Integer(11)); // Insert at an index
    print("9: " + pets);
    
    List<Integer> sub = pets.subList(1, 4);
    print("subList: " + sub);
    print("10: " + pets.containsAll(sub));
    
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + pets.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + pets.containsAll(sub));
    
    List<Integer> copy = new ArrayList<Integer>(pets);
    print("copy: "+ copy);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    
    
    copy = new ArrayList<Integer>(pets); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new Integer(9)); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + pets.isEmpty());
    pets.clear(); // Remove all elements
    print("19: " + pets);
    print("20: " + pets.isEmpty());
    pets.addAll(Arrays.asList(1,2,3,4));
    print("21: " + pets);
    Object[] o = pets.toArray();
    print("22: " + o[3]);
    Integer[] pa = pets.toArray(new Integer[0]);
    print("23: " + pa);
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
