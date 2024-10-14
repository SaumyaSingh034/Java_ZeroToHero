package vimoInterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("hello")); // helo
        System.out.println(removeDup("apple")); // aple
        System.out.println(removeDup("aaaaaa")); // a
        System.out.println(removeDup("abc")); // abc
    }

    private static String removeDup(String str) {
        StringBuffer sb = new StringBuffer();
        Map<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c  : ch){
            if(!hm.containsKey(c)){
                hm.put(c,1);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
