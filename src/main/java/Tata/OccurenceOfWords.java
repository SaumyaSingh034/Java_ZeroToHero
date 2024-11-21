package Tata;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfWords {
    public static void main(String[] args){
        String s = "This is a test, test sentence to find, find a repetitive words. repetitive words!";
        String str = s.replaceAll("[^a-zA-Z0-9\\s]","");
        System.out.println(str);
        countOccurenceOfWords(str);
    }

    private static void countOccurenceOfWords(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> hashData = new LinkedHashMap<>();

        for(String word : words){
            hashData.put(word, hashData.getOrDefault(word,0)+1);
        }
        //System.out.println(hashData);

        for(Map.Entry data : hashData.entrySet()){
            System.out.println(data.getKey()+" --> "+data.getValue());
        }
    }
}
