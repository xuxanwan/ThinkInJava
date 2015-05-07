package holding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class Ex16 {
    private final static String vowels = "aeiouAEIOU"; 
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("./code/holding/SetOperations.java", "\\W+"));
        
        Set<String> vowel = new HashSet<String>();

        Iterator<String> iter = words.iterator();
        int totalCount = 0;
        while (iter.hasNext()) {
            String wordTemp = (String) iter.next();
            char[] wordTempArray = wordTemp.toCharArray();
            for (int i = 0; i < wordTempArray.length; i++) {
                int count = 0;
                if (vowels.contains(wordTempArray[i]+"")) {
                    count ++;
                    totalCount++;
                }
                System.out.println(count);
            }
        }
        System.out.println(totalCount);
    }
}
