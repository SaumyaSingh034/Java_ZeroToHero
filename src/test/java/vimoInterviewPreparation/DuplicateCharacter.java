package vimoInterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        findDuplicateCharacter("SaumyaSingh");

    }

    private static void findDuplicateCharacter(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> data : hm.entrySet()){
            if(data.getValue()>1){
                System.out.println(data.getKey()+" ---> "+data.getValue());
            }
        }
    }
}
