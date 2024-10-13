package vimoInterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChars {
    public static void main(String[] args){
        String str = "swiss";
        char result = countNonRepeatingChars(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
        
    }
    
    private static Character countNonRepeatingChars(String str){
        char[] ch = str.toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for(Character c : ch){
            data.put(c, data.getOrDefault(c, 0)+1);
        }
        for(Character c : ch){
            if(data.get(c) == 1)
                return c;
        }
        return null;
    }
}
