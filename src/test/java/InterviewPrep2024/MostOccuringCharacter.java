package InterviewPrep2024;

import java.util.HashMap;
import java.util.Map;

public class MostOccuringCharacter {
    public static void main(String[] args){
        String str = "mississippi";
        mostOccuredCharacterInString(str);
    }

    private static void mostOccuredCharacterInString(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch)
            hm.put(c, hm.getOrDefault(c, 0)+1);
        int max = 0;
        for(int i : hm.values() ){
            if(i>max){
                max = i;
            }
        }
        for(Map.Entry<Character, Integer> key : hm.entrySet()){
            if(key.getValue()==max)
                System.out.println(key.getKey());
        }
    }
}
