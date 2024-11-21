package Tata;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
    public static void main(String[] args){
        String str = "saumyasingh";
        countFrenquencyCharacter(str);
    }

    private static void countFrenquencyCharacter(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for(char c : ch){
            data.put(c, data.getOrDefault(c, 0)+1);
        }

        for(Map.Entry set : data.entrySet()){
            System.out.println(set.getKey()+" ----> "+set.getValue());
        }
    }
}
