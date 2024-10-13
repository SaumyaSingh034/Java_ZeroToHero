package vimoInterviewPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Interview1 {
    public static void main(String[] args){
        String[] words = {"bella", "label", "roller"};
        String[] words1 = {"saumysa", "tanya", "samesyra","rahul","tryaksh"};
       System.out.println(printCommonChars(words));
    }

    private static List<Character> printCommonChars(String[] words) {
        List<Character> result = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : words[0].toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        for(int i=1;i< words.length;i++){
            HashMap<Character, Integer> current = new HashMap<>();
            for(char c : words[i].toCharArray()){
                current.put(c, current.getOrDefault(c,0)+1);
            }
            for(char c : hm.keySet()){
                if(current.containsKey(c)){
                    hm.put(c, Math.min(hm.get(c), current.get(c)));
                } else{
                    hm.put(c, 0);
                }
            }
        }

        for(char c: hm.keySet()){
            int count = hm.get(c);
            for(int i=0;i<count;i++){
                result.add(c);
            }
        }
        return result;

    }

}
