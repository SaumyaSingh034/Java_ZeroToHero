package December2024Prep;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfSpecialChar {
    public static void main(String[] args){
        String word = "aaAbcBC";
        String word1 = "abc";
        String word2 = "abBCab";
        System.out.println(numberOfSpecialChars(word2));
    }

    private static int numberOfSpecialChars(String word) {
        String small = word.replaceAll("[^a-z]","");
        String caps = word.replaceAll("[^A-Z]","");
        Set<Character> result = new HashSet<>();
        Set<Character> resultC = new HashSet<>();
        for(char c : small.toCharArray()){
            result.add(c);
        }
        for(char c : caps.toLowerCase().toCharArray()){
            resultC.add(c);
        }

        if(result.equals(resultC))
            return result.size();
        else
            return 0;
    }
}
