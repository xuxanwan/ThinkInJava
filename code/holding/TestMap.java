package holding;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Integer> vowels = new TreeMap<String, Integer>();
		vowels = new HashMap<String, Integer>();
		vowels.put("2", null);
		vowels = new Hashtable<String, Integer>();
//		vowels.put("2", null);

		System.out.println(vowels);
	}

}
