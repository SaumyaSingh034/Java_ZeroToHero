package YoutubeJavaInterview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args){
        String str = "java";
       // duplicateCharacters(str);
        duplicateCharacters("saumyasaumya");
    }

    private static void duplicateCharacters(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for(char c : ch){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue()>1){
                System.out.println(dataSet.getKey()+" ---> "+dataSet.getValue());
            }
        }
    }
}
