package InterviewPrep2024;

import java.util.*;


public class SortByValues {
    public static void main(String[] args){
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 3);
        unsortedMap.put("Banana", 1);
        unsortedMap.put("Orange", 2);
        unsortedMap.put("Grapes", 4);

        System.out.println("Unsorted Map: " + unsortedMap);

        // Step 2: Sort the map by values
        Map<String, Integer> sortedMap = sortByValues(unsortedMap);

        System.out.println("Sorted Map (by values): " + sortedMap);
    }

    private static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> hm : entryList){
            sortedMap.put(hm.getKey(), hm.getValue());

        }
        return sortedMap;
    }
}
