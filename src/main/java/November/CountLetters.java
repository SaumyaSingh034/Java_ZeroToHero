package November;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(countLetters("hello")); // {h=1, e=1, l=2, o=1}
        System.out.println(countLetters("aauuchhh")); // {a=2, u=2, c=1, h=3}
        System.out.println(countLetters("aaaaaa")); // {a=6}
        System.out.println(countLetters("abc")); // {a=1, b=1, c=1}
    }

    private static Map<Character, Integer> countLetters(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : ch)
            hm.put(c, hm.getOrDefault(c,0)+1);

        return hm;
    }
}
