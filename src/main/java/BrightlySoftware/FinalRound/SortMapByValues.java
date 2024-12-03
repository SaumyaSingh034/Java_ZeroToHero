package BrightlySoftware.FinalRound;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args){
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Virat",21);
        hm.put("Rohit",28);
        hm.put("Jadega",29);
        hm.put("Shubman",11);
        hm.put("Dhoni",2);

        sortByValues(hm);
    }

    private static void sortByValues(Map<String, Integer> hm) {
        hm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(hm);
    }
}
