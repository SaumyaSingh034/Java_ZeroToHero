package November;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        System.out.println(removeDup("hello")); // helo
        System.out.println(removeDup("apple")); // aple
        System.out.println(removeDup("aaaaaa")); // a
        System.out.println(removeDup("abc")); // abc
    }

    private static StringBuilder removeDup(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        Set<Character> characterSet = new LinkedHashSet<>();
        for(char c : ch)
            characterSet.add(c);
        for(Character c : characterSet)
            sb.append(c);
        return sb;
    }
}
