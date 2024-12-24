package Interview2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {
    public static void main(String[] args){
        String str = "javacodeinglovejava";
        removeDuplicateChars(str);
    }

    private static void removeDuplicateChars(String str) {
        char[] words = str.toCharArray();
        Set<Character> dataSet = new LinkedHashSet<>();
        for(char c : words){
            dataSet.add(c);
        }

        System.out.println(dataSet);
        StringBuffer sb = new StringBuffer();
        for(char c : dataSet){
            sb.append(c);
        }
        System.out.println(sb.toString());


    }
}
