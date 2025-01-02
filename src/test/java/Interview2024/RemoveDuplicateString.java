package Interview2024;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args){
        String s = "java is best best is coding coding language and python python too too";
       System.out.println( removeDuplicateString(s));
    }

    private static String removeDuplicateString(String s) {
        String[] words = s.split("\\s+");
        Set<String> wordSet = new LinkedHashSet<>();
        StringBuffer result = new StringBuffer();
        for(String word : words){
            wordSet.add(word);
        }
        for(String data : wordSet)
            result.append(data).append(" ");

        return result.toString().trim();
    }
}
