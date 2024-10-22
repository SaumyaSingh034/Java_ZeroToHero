package EPAM;

import java.util.*;

public class RemoveRedundancy {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        removeRedundancyFromString(str);
    }

    private static void removeRedundancyFromString(String str) {
       StringBuffer sb = new StringBuffer();
        char[] ch = str.toCharArray();
        Map<Character,Integer> characterSet = new LinkedHashMap<>();
        for(char c : ch){
            if(!characterSet.containsKey(c)){
                characterSet.put(c,1);
                sb.append(c);
            }else{
                characterSet.put(c, characterSet.get(c)+1);
            }
        }
        System.out.println(sb);

    }
}
