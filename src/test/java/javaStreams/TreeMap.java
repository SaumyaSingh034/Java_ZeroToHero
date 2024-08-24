package javaStreams;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {

    public static void main(String[] args){
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"HashMap");
        hashMap.put(3,"TreeMap");
        hashMap.put(2,"vs");
        System.out.println(hashMap);


        Map<Integer,String> treeMap = new java.util.TreeMap<>();
        treeMap.put(1,"Saumya");
        treeMap.put(3,"Rahul");
        treeMap.put(2,"Tryaksh");
        System.out.println(treeMap);

    }
}
