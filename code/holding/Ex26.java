package holding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import net.mindview.util.TextFile;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>(new TextFile(
				"./code/holding/SetOperations.java", "\\W+"));
		Map<String, ArrayList<Integer>> wordOccurAddr = new TreeMap<String, ArrayList<Integer>>();
		for(int i=0; i<words.size(); i++){
			String word = words.get(i);
			if(wordOccurAddr.containsKey(word)){
				wordOccurAddr.get(word).add(i);
			}else{
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				wordOccurAddr.put(word, (ArrayList<Integer>) list);
			}
		}
		System.out.println(words);
		System.out.println(wordOccurAddr);
		
		
		//还原
		Map<Integer, String> mapToWord = new TreeMap<Integer, String>();
		for(Entry<String, ArrayList<Integer>> entry: wordOccurAddr.entrySet()){
			ArrayList<Integer> tempList = entry.getValue();
			for(Integer tempInt :tempList){
				mapToWord.put(tempInt, entry.getKey());
			}
		}
		System.out.println(mapToWord);
		
	}

}
