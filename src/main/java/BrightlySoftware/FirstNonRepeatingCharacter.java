package BrightlySoftware;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        System.out.println(findFirstNonRepeated("swiss"));
    }

    private static Character findFirstNonRepeated(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return '\0';
    }
}
