package November;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {
    public static void main(String[] args){
        String str = "tryakshsinghbist";
        countOccurenceOfCharacter(str);
    }

    private static void countOccurenceOfCharacter(String str) {
        Map<Character, Integer> data = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> keySet : data.entrySet()){
            if(keySet.getValue()>1 && keySet.getKey()!=' ')
                System.out.println(keySet.getKey()+" ------> "+keySet.getValue());
        }
    }

}
