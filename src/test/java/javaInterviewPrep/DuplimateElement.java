package javaInterviewPrep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplimateElement {

    public static void main(String[] args){

        String[] data = {"Infosys", "TCS","TCS","Microsoft","Amazon","Infosys","Globant","Google", "Microsoft","Globant","TCS"};

        /*
        1. Brute Force
        2. HashSet
        3. HashMap
        4. Streams
         */

        System.out.println("*************** BRUTE FORCE ****************");
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j< data.length;j++){
                if(data[i].equalsIgnoreCase(data[j]))
                    System.out.println(data[i]);
            }
        }

        System.out.println("************** HASH SET *******************");
        Set<String> dataSet = new HashSet<String>();
        for(String s : data){
            if(dataSet.add(s)==false)
                System.out.println(s);
        }

        System.out.println("***************** HASH MAP **************");
        Map<String, Integer> dataMap = new HashMap<>();
        for(String s : data){
            if(dataMap.get(s)==null)
                dataMap.put(s,1);
            else
                dataMap.put(s, dataMap.get(s)+1);
        }

        Set<Map.Entry<String, Integer>> keySet = dataMap.entrySet();
        for(Map.Entry<String, Integer> s : keySet) {
            if (s.getValue() > 1)
                System.out.println(s.getKey());
        }

    }
}
