package January2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurenceOfEachElement {
    public static void main(String[] args){
        String str = "Try Programming";
        findOccurenceOfElement(str);

    }

    private static void findOccurenceOfElement(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for(char c : ch){
            if(c!=' ')
                hm.put(c, hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm);
    }
}
