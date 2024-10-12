package vimoInterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args){
        String str = "I am a java developer and I am proud of it ";
        findDuplicateWord(str);

    }

    private static void findDuplicateWord(String str){
        String[] words = str.split(" ");
        Map<String, Integer> hm = new HashMap<>();
        for(String word : words){
            if(hm.containsKey(word)){
                hm.put(word, hm.get(word)+1);
            } else {
                hm.put(word,1);
            }
        }
        for(Map.Entry<String, Integer> data : hm.entrySet()){
            if(data.getValue()>1){
                System.out.println(data.getKey()+" -------> "+data.getValue());
            }
        }
    }
}
