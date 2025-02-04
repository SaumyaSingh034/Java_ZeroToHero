package IMP_InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question8 {
    public static void main(String[] args){
        //Pay Pay Interview Questions

        //Print Duplicate Element Only
        int[] arr = {4,2,3,5,1,6,7,2,3};
        printDuplicateElements(arr);
    }

    private static void printDuplicateElements(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> data = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            data.put(arr[i], data.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> key : data.entrySet()){
            if(key.getValue()>=2){
                result.add(key.getKey());
            }

        }
        System.out.println(result);
    }
}
