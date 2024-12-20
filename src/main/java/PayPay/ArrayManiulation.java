package PayPay;

import java.util.*;

public class ArrayManiulation {
    public static void main(String[] args){
        int[] arr = {4,2,3,5,6,7,2,3,1,9};
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i< arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> keyData : hm.entrySet()){
            if(keyData.getValue()>=2){
                result.add(keyData.getKey());
            }
        }
        System.out.println(Arrays.toString(result.toArray()));


    }
}
