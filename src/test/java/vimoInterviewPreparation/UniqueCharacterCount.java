package vimoInterviewPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueCharacterCount {
    public static void main(String[] args){
        String str1 = "abcdABCDabcd";
        characterCount(str1);
        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));
        //ourn

    }

    public static void characterCount(String str){
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        Map<Character, Integer> unique = new HashMap<>();
        for(char c : ch){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }else {
                hm.put(c, 1);
                unique.put(c,1);
            }
        }
        System.out.println(hm);
        System.out.println(unique);
    }
}
