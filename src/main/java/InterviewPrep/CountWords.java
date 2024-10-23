package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args){
        String str = "I am learning learning java java java programming";
        String[] words = str.split("\\s");
        Map<String, Integer> hashWord = new HashMap<>();
        for(String word : words){
            if(hashWord.containsKey(word)){
                hashWord.put(word, hashWord.get(word)+1);
            }else {
                hashWord.put(word, 1);
            }
        }

        for(Map.Entry entry : hashWord.entrySet()){
            System.out.println("The count of word : "+entry.getKey()+" ---> "+entry.getValue());
        }

    }
}
