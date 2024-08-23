package LinkedInJavaProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInArray {
    public static void main(String[] args){
        int[] arr = {3,5,44,44,55,3,5,44,44,44,44,9,7,6,5,55,6};
        countFrequencyOfElementInArray(arr);

    }

    private static void countFrequencyOfElementInArray(int[] arr) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i< arr.length;i++){
            if(hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            else
                hashMap.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> key : hashMap.entrySet()){
            System.out.println(key.getKey()+" ---> "+key.getValue());
        }
    }
}
