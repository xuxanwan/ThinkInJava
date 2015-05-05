package _11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class GenerationMoive {
    private String[] movies = { "snow white", "star war", "legal high", "break bad", };
    private int      i      = 0;

    public String next() {
        if (i == movies.length) {
            i = 0;
        }
        return movies[i++];
    }
}

public class CollectionTest {

    public static void main(String[] args) {
        GenerationMoive gm = new GenerationMoive();
        Collection<String> al = new ArrayList<String>();
        addAndShow(al, gm);

        al = new LinkedList<String>();
        addAndShow(al, gm);
        
        al = new HashSet<String>();
        addAndShow(al, gm);
        
        al = new LinkedHashSet<String>();
        addAndShow(al, gm);
        
        al = new TreeSet<String>();
        addAndShow(al, gm);

    }

    /**
     * @Title：addAndShow
     * @Class：TestCollection
     * @return：void
     * @param:@param al
     * @param:@param gm
     * @Description:
     * @author : bairongfeng@hzquanwei.com
     * @Date：2015年4月30日
     */

    private static void addAndShow(Collection<String> al, GenerationMoive gm) {
        for (int i = 0; i < 8; i++) {
            al.add(gm.next());
        }
        System.out.println(al);
    }

}
