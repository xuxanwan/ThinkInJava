package holding;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class Ex20 {

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("./code/holding/SetOperations.java", "\\W+"));
        System.out.println(words);
        new Ex20().countVowel(words);
    }
    
    public void countVowel(Set<String> words){
        //aeiouAEIOU放入TreeMap中使用
        Map<String, Integer> vowels = new TreeMap<String, Integer>();
        vowels.put("a", 0);
        vowels.put("e", 0);
        vowels.put("i", 0);
        vowels.put("o", 0);
        vowels.put("u", 0);
        vowels.put("A", 0);
        vowels.put("E", 0);
        vowels.put("I", 0);
        vowels.put("O", 0);
        vowels.put("U", 0);
        //遍历words，统计
        System.out.println(vowels.keySet());
        for (String word : words) {
            for (Character ch : word.toCharArray()) {
                if (vowels.keySet().contains(ch.toString())) {
                    System.out.println(ch);
                    vowels.put(ch.toString(), vowels.get(ch.toString()) + 1);
                }
            }
        }
        //打印map
        System.out.println(vowels);
    }

}
