package YoutubeJavaInterview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String s = "saumya";
       char c =  firstNonRepeatingCharacter(s);
       System.out.println(c);
    }

    private static char firstNonRepeatingCharacter(String s) {
       char[] ch = s.toCharArray();
       Map<Character, Integer> data = new HashMap<>();
       for(char c : ch){
           data.put(c, data.getOrDefault(c,0)+1);
       }
     /*  for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
           if(dataSet.getValue()==1)
               System.out.println(dataSet.getKey()+ "--> "+ dataSet.getValue());
       }*/

        for(char c : ch){
            if(data.get(c) == 1)
                return c;
        }
        return 0;
    }
}
