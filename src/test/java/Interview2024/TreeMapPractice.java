package Interview2024;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args){
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("Saumya",1);
        treeMap.put("Tryaksh",1);
        treeMap.put("Rahul",2);
        treeMap.put("Piyush",3);
      // treeMap.put(null,null);
        treeMap.put("",null);


        System.out.println(treeMap);

        for(Map.Entry m : treeMap.entrySet())
            System.out.println(m.getKey()+" ----> "+m.getValue());
    }
}
