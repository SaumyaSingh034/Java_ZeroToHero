package BrightlySoftware;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceString {
    public static void main(String[] args) {
        System.out.println(findMaxOccurring("success")); // Output: s
    }

    private static char findMaxOccurring(String str) {
        int max = 0;
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        for(int value : hm.values()){
            if(value>max){
                max = value;
            }
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue()==max){
                return entry.getKey();
            }
        }
        return '\0';
    }
}
