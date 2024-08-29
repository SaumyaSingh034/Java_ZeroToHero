package linkedIn;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestElementInHashMap {

    public static void main(String[] args){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,9);
        hm.put(2, 8);
        hm.put(3, 7);
        hm.put(4, 10);

        Map.Entry<Integer, Integer> highest = null;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(highest ==null || entry.getValue() >=highest.getValue())
                highest=entry;
        }
        System.out.println(highest);
    }
}
