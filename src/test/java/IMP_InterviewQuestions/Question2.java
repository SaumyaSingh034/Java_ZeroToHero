package IMP_InterviewQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args){

        //   VIMO FITMENT
        /*
        Given a hashmap containing String key and Int value
        Print the minimum value with the key
         */

        Map<String, Integer> data = new HashMap<>();
        Integer min;
        String name;
        data.put("Rohit",30);
        data.put("Virat",27);
        data.put("Jadega",25);
        data.put("Ashwin",34);
        data.put("Shuman",31);

        getTheMinimumScore(data);
        int minimum = Collections.min(data.values());
        System.out.println(minimum);

    }

    private static void getTheMinimumScore(Map<String, Integer> data) {
        Map.Entry<String, Integer> min = null;
        for(Map.Entry<String, Integer> key : data.entrySet()){
            if(min==null || key.getValue()<min.getValue()){
                min = key;
            }
        }
        System.out.println(min.getKey()+" --> "+min.getValue());
    }


}
