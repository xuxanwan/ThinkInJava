package holding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex18 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String,String> aa = new HashMap<String,String>();
        Map<String,String> bb = new LinkedHashMap<String, String>();
        aa.put("lx", "lx");
        aa.put("yl", "yl");
        aa.put("zjt", "zjt");
        aa.put("yhb", "yhb");
        aa.put("pjy", "pjy");
        aa.put("sx", "sx");
        aa.put("zk", "zk");
        aa.put("sdl", "sdl");
        aa.put("zqc", "zqc");
        aa.put("zzl", "zzl");
        aa.put("hqz", "hqz");
        aa.put("xq", "xq");
        aa.put("cjj", "cjj");
        
        
        System.out.println(aa);
        
        
        Iterator<String> iter = aa.keySet().iterator();
        
        while(iter.hasNext()){
            String temp = iter.next();
            System.out.println(temp+"``"+aa.get(temp)+"```"+temp.hashCode());
            bb.put(temp, aa.get(temp));
        }
        System.out.println(bb);
    }

}
