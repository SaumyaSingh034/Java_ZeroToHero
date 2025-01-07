package January2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintCharWithOccurence {
    public static void main(String[] args){
        String str = "aabbbccccddddd";
        printCharacterWithOccurenceCount(str);

    }

    private static void printCharacterWithOccurenceCount(String str) {
        char[] data = str.toCharArray();
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        StringBuffer result = new StringBuffer();
        for(char c : data){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry dataEntry : dataMap.entrySet()){
            result.append(dataEntry.getKey()).append(dataEntry.getValue());
        }

        System.out.println(result);

    }
}
