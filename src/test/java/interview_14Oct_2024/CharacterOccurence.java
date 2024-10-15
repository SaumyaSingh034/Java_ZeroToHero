package interview_14Oct_2024;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
    public static void main(String[] args){
        String str = "JavaProgramming";
        countCharacters(str);
    }

    private static void countCharacters(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> hmData = new HashMap<>();
        for(char c : ch){
            hmData.put(c, hmData.getOrDefault(c,0)+1);
        }

        for(Map.Entry dataSet : hmData.entrySet()){
            System.out.println(dataSet.getKey()+ " ----------> "+dataSet.getValue());
        }
    }
}
