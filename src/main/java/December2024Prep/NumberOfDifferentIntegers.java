package December2024Prep;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegers {
    public static void main(String[] args){
        String word = "a123bc34d8ef34";
        String word1 = "leet1234code234";
        String word2 = "a1b01c001";
        System.out.println(numDifferentIntegers(word2));
    }

    private static int numDifferentIntegers(String word) {
        String[] numbers = word.replaceAll("[^0-9]"," ").split("\\s+");
        Set<String> result = new HashSet<>();
        for(String s : numbers){
            if(!s.isEmpty()){
                result.add(String.valueOf(s.replaceAll("^0*","")));
            }
        }
        /*System.out.println(result);
        System.out.println(result.size());*/
        return result.size();




    }
}
