package SDETInvertiewQuestions;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordpatternMethod(String pattern, String str) {
        Map<Character, String> hm = new HashMap<>();
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(arr[i])) {
                    return false;
                }
            } else {
                if (hm.containsValue(arr[i]))
                    return false;
            }
            hm.put(ch, arr[i]);
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(wordpatternMethod("abba","dog cat cat dog"));
    }
}
