package BrightlySoftware.FinalRound;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingchar {
    public static void main(String[] args){
        String str = "Saumya";
        System.out.println(firstNonRepeatedChar(str));
    }

    private static Character firstNonRepeatedChar(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for(char c : ch)
            hm.put(c, hm.getOrDefault(c,0)+1);
        for(Map.Entry<Character, Integer> data : hm.entrySet()){
            if(data.getValue()==1)
                return data.getKey();
        }
        return null;
    }
}
