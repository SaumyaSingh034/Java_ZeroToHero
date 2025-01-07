package Interview2024;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args)
    {
        String str = "sillyspiders";
        System.out.println(firstNonRepeatedCharAgain(str));

    }

    private static Character firstNonRepeatedCharAgain(String str) {
        char[] data = str.toCharArray();
        Map<Character, Integer> dataSet = new LinkedHashMap<>();
        for(char c : data)
            dataSet.put(c, dataSet.getOrDefault(c, 0)+1);

        for(Map.Entry<Character, Integer> entry : dataSet.entrySet())
            if(entry.getValue()==1){
               return entry.getKey();
            }


        return null;
    }
}
