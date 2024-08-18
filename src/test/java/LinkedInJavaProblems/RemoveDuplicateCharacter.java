package LinkedInJavaProblems;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {
        String str = "Saumya";
        System.out.println(removeDuplicateCharacter(str));
        System.out.println(removeDuplicateCharacter("Java"));
    }

    private static String removeDuplicateCharacter(String str) {
        StringBuffer sb = new StringBuffer();
        Map<Character, Integer> charMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (charMap.containsKey(c))
                charMap.put(c, charMap.get(c) + 1);
            else
                charMap.put(c, 1);
        }
        System.out.println(charMap);

        for (Map.Entry<Character, Integer> key : charMap.entrySet()) {
            if (key.getValue() > 1)
                continue;
            else
                sb.append(key.getKey());
        }
        return sb.reverse().toString();

    }
}
