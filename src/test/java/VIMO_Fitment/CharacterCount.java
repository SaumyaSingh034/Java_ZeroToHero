package VIMO_Fitment;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args){
        String s = "Try programming";
        s = s.replaceAll(" ", "");
        char[] ch = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm);
    }
}
