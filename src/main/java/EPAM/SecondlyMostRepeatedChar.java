package EPAM;

import java.util.HashMap;
import java.util.Map;

public class SecondlyMostRepeatedChar {
    public static void main(String[] args){
        String str = "aabbbcddeeee";
        secondlyMostRepeatedChar(str);
    }

    private static void secondlyMostRepeatedChar(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c,0)+1);
        }
        int secondMax = 0;
        int max = 0;
        for(int i : characterIntegerMap.values()){
            if(i>max){
                secondMax = max;
                max = i;
            } else if (i> secondMax) {
                secondMax = i;

            }
        }
        for(Map.Entry<Character, Integer> dataSet : characterIntegerMap.entrySet()){
            if(dataSet.getValue()==secondMax){
                System.out.println(dataSet.getKey()+"  -----> "+dataSet.getValue());
            }
        }
    }
}
