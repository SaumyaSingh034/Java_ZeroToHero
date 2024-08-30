package JSON_Jackson;

import java.util.HashMap;
import java.util.Map;

public class DuplicateHashMap {

    public static void main(String[] args){
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(1,1);
        hm.put(1,1);
        hm.put(null,1);
        hm.put(3,null);
        hm.put(null,null);
        hm.put(2,1);

        System.out.println(hm);
    }
}
