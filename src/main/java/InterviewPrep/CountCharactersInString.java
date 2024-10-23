package InterviewPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharactersInString {
    public static void main(String[] args){
        String str = "HelloSaumyaSingh";
        Map<Character, Integer> hm = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for(int i=0;i< ch.length;i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i],hm.get(ch[i])+1);
            } else{
                hm.put(ch[i],1);
            }
        }

        for(Map.Entry key : hm.entrySet()){
            System.out.println(key.getKey()+" -----> "+key.getValue());
        }

    }
}
