package InterviewPrep2024;

import java.util.HashMap;
import java.util.Map;

public class CountOccureceOfString {
    public static void main(String[] args){
        String str = "Saumya is a good java programmer programmer Saumya is a";
        countOccurenceOfWords(str);
    }

    private static void countOccurenceOfWords(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> hm = new HashMap<>();
        for(String s : words){
            hm.put(s, hm.getOrDefault(s,0)+1);
        }
        System.out.println(hm);
    }
}
