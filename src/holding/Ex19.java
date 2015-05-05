package holding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//holding/Ex18.java
//TIJ4 Chapter Holding, Exercise 18, page 236
/* Fill a HashMap with key-value pairs. Print the results to show ordering
* by hash code. Extract the pairs, sort by key, and place the result into a 
* LinkedHashMap. Show that the insertion order is maintained. 
*/
public class Ex19 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<String> aa = new HashSet<String>();
        Set<String> bb = new LinkedHashSet<String>();
        aa.add("lx");
        aa.add("yl");
        aa.add("zjt");
        aa.add("yhb");
        aa.add("pjy");
        aa.add("sx");
        aa.add("zk");
        aa.add("sdl");
        aa.add("zqc");
        aa.add("zzl");
        aa.add("hqz");
        aa.add("xq");
        aa.add("cjj");

        System.out.println(aa);

        Iterator<String> iter = aa.iterator();

        while (iter.hasNext()) {
            String temp = iter.next();
            System.out.println(temp +"```" + temp.hashCode());
            bb.add(temp);
        }
        System.out.println(bb);
    }

}
