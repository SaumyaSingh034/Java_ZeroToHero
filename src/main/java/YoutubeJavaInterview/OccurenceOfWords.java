package YoutubeJavaInterview;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {
    public static void main(String[] args){
        String str = "This this is is done by Saket Saket";
        countOccurenceOfWords(str);
    }

    private static void countOccurenceOfWords(String str) {
        String[] ch = str.split(" ");
        Map<String, Integer> data = new HashMap<>();
        for(String s : ch){
            data.put(s, data.getOrDefault(s,0)+1);
        }

        for(Map.Entry keySet : data.entrySet()){
            System.out.println(keySet.getKey()+ " ------> "+keySet.getValue());
        }
    }
}
