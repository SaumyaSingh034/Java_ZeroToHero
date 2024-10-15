package interview_14Oct_2024;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuredString {
    public static void main(String[] args) {
        String str = "mississippi";
        maxOccuredCharacterInString(str);
    }

    private static void maxOccuredCharacterInString(String str) {
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        int max = 0;
        for(int i : hm.values()){
            if(i>max){
                max = i;
            }
        }

        for(Map.Entry<Character, Integer> key : hm.entrySet()){
            if(key.getValue() == max){
                System.out.println(key.getKey()+" -----> "+key.getValue());
            }
        }
    }
}
