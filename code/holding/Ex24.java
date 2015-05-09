package holding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex24 {
	public static void main(String[] args) {
		Map<String, Gerbil> map = new LinkedHashMap<String, Gerbil>();
		Map<String, Gerbil> tempMap = new TreeMap<String, Gerbil>();
		
		map.put("hello", new Gerbil(1));
		map.put("one", new Gerbil(2));
		map.put("hello2", new Gerbil(3));
		map.put("hello4", new Gerbil(4));
		map.put("hello5", new Gerbil(5));
		
		System.out.println(map);
		tempMap.putAll(map);
		System.out.println(tempMap);
		map.clear();
		map.putAll(tempMap);
		System.out.println(map);
		
	}
}
