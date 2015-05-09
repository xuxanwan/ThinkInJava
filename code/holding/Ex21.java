package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class Ex21 {

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
			totalWords ++;
			if (wordCount.containsKey(temp)) {
				Integer count = wordCount.get(temp);
				wordCount.put(temp, count == null ? 1 : count + 1);
			} else {
				wordCount.put(temp, 1);
			}
		}

		System.out.println(wordCount);
		System.out.println(totalWords);
	}

}
