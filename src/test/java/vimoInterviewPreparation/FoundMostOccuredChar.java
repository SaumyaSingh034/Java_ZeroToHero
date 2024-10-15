package vimoInterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class FoundMostOccuredChar {
    public static void main(String[] args){
        String str = "mississippi";
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        int max=0;
        for(int i : hm.values()){
            if(i>max){
                max = i;
            }
        }

        for(Map.Entry<Character, Integer> key : hm.entrySet()){
            if(key.getValue() == max){
                System.out.println(key.getKey()+" -----> "+key.getValue());
            }
        }




    }

    private void countMaxOccuredChar(String str){
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        int maxFrequency = 0;
        for(int i : hm.values()){
            if(i>maxFrequency)
                maxFrequency = i;
        }

        for(Map.Entry<Character, Integer> keySet : hm.entrySet()){
            if(keySet.getValue() == maxFrequency){
                System.out.println(keySet.getKey()+" -----> "+keySet.getValue());
            }
        }
    }
}
