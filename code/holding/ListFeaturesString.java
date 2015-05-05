package holding;

import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

//: holding/ListFeatures.java

public class ListFeaturesString {
  public static void main(String[] args) {
      Random rand = new Random(47);
      List<String> strings = new ArrayList<String>(Arrays.asList("brf", "zzl", "hqz", "zzt", "bxx", "xq"));
      print("1: " + strings);
      String lxx = "lxx";
      strings.add(lxx);
      print("2: "+ strings);
      print("3: " + strings.contains(lxx));
      strings.remove(lxx); // Remove by object
      String zzl = strings.get(1);
      print("4: " +  zzl + " " + strings.indexOf(zzl));
      String wp = "wp";
      print("5: " + strings.indexOf(wp));
      print("6: " + strings.remove(wp));
      
   // Must be the exact object:
      print("7: " + strings.remove(zzl));
      print("8: " + strings);
      
      strings.add(3, "pjy");
      print("9: " + strings);
      
      List<String> sub = strings.subList(1, 4);
      print("subList: " + sub);
      print("10: " + strings.containsAll(sub));
      Collections.sort(sub); // In-place sort
      print("sorted subList: " + sub);
      
      // Order is not important in containsAll():
      print("11: " + strings.containsAll(sub));
      
      Collections.shuffle(sub, rand); // Mix it up
      
      print("shuffled subList: " + sub);
      print("12: " + strings.containsAll(sub));
      
      
      List<String> copy = new ArrayList<String>(strings);
      sub = Arrays.asList(strings.get(1), strings.get(4));
      print("sub: " + sub);
      copy.retainAll(sub);
      print("13: " + copy);
      
      
      copy = new ArrayList<String>(strings); // Get a fresh copy
      copy.remove(2); // Remove by index
      print("14: " + copy);
      copy.removeAll(sub); 
      print("15: " + copy);
      copy.set(1, "lg"); // Replace an element
      print("16: " + copy);
      copy.addAll(2, sub); // Insert a list in the middle
      print("17: " + copy);
      print("18: " + strings.isEmpty());
      strings.clear(); // Remove all elements
      print("19: " + strings);
      print("20: " + strings.isEmpty());
  }
} 