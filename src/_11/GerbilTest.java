package _11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GerbilTest {

	public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<String, Gerbil>();
        Gerbil smallWhite = new Gerbil(1, "smallWhite");
        Gerbil bigBlack = new Gerbil(2, "blgBlack");
        gerbilMap.put("smallWhite", smallWhite);
        gerbilMap.put("bigBlack", bigBlack);
        
        
        Iterator<String> iterator =  gerbilMap.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);
            Gerbil value = gerbilMap.get(key);
            value.hop();
        }
	}
	
	
	public void test(){
	    List<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil(0));
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        for(int i=0; i< gerbils.size(); i++){
            gerbils.get(i).hop();
        }
	}

}
