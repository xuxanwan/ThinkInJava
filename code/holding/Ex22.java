package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.mindview.util.TextFile;

class Word {
	private String word = null;
	private Integer count = null;

	public Word(String word, Integer count) {
		this.word = word;
		this.count = count;
	}
}

public class Ex22 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile(
				"./code/holding/SetOperations.java", "\\W+"));
		Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();

		System.out.println(words);
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println(words);
		int totalWords = 0;

		Iterator<String> itra = words.iterator();
		while (itra.hasNext()) {
			String temp = itra.next();
			totalWords++;
			if (wordCount.containsKey(temp)) {
				Integer count = wordCount.get(temp);
				wordCount.put(temp, count == null ? 1 : count + 1);
			} else {
				wordCount.put(temp, 1);
			}
		}

		System.out.println(wordCount);
		System.out.println(totalWords);
		System.out.println(wordCount.size());
		
		
		Set<Word> wordClassSet = new HashSet<Word>();
		
		for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
			wordClassSet.add(new Word(entry.getKey(),entry.getValue()));
		}
		System.out.println(wordClassSet);
		System.out.println();
		System.out.println(wordClassSet.size());
	}
}
