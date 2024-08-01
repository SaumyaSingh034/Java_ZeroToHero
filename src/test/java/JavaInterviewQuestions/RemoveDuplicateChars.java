package JavaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String data = "characters";
        char[] ch = data.toCharArray();
        System.out.println(removeDuplicates(ch));
    }

    private static String removeDuplicates(char[] ch) {
        Map<Character, Integer> hashMap = new HashMap<>();
        String newData = "";
        for(int i=0;i< ch.length;i++){
            if(!hashMap.containsKey(ch[i])){
                newData += ch[i];
                hashMap.put(ch[i], 1);
            }
        }
        return newData;
        }
}
