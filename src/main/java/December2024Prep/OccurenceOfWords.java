package December2024Prep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfWords {
    public static void main(String[] args){
        String str = "Hello Saumya How you are learning java java java script script type    script" +
                "   data Saumya Hello java";
        occurenceOfWordsInSentence(str);
    }

    private static void occurenceOfWordsInSentence(String str) {
        String[] words = str.trim().split("\\s+");
        Map<String, Integer> stringMap = new LinkedHashMap<>();
        for(String word : words){
            if(!word.isEmpty())
                stringMap.put(word, stringMap.getOrDefault(word,0)+1);
        }

        for(Map.Entry dataSet : stringMap.entrySet()){
            System.out.println(dataSet.getKey()+" -----> "+dataSet.getValue());
        }

    }
}
