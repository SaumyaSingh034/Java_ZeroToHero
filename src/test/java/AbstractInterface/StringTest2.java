package AbstractInterface;

import java.util.HashMap;
import java.util.Map;

public class StringTest2 {
    public static void main(String[] args){
        String s = "Saumyaa";
        countCharactersOccurences(s);
    }

    private static void countCharactersOccurences(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for(char c : ch){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(Map.Entry dataSet : data.entrySet()){
            System.out.println(dataSet.getKey()+" -----> "+dataSet.getValue());
        }
    }
}
