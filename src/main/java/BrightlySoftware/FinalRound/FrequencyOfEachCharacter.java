package BrightlySoftware.FinalRound;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharacter {
    public static void main(String[] args){
        String str = "rahulsinghbist";
        countEachCharacter(str);
    }

    private static void countEachCharacter(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        System.out.println(hm);
    }
}
