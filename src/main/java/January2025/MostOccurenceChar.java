package January2025;

import java.util.HashMap;
import java.util.Map;

public class MostOccurenceChar {
    public static void main(String[] args){
        String str = "mississippi";
        mostOccurrenceCharacter(str);
    }

    private static void mostOccurrenceCharacter(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for(char c : ch){
            data.put(c,data.getOrDefault(c,0)+1);
        }
        int max = 0;
        for(int i : data.values()){
            if(i>max){
                max = i;
            }
        }

        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue() == max){
                System.out.print(dataSet.getKey()+" ");
            }
        }
    }
}
