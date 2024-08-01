package JavaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueElement {

    public static void main(String[] args){
        int[] arr1 = {4,5,5,7,6,6,7,4,9,5};
        int[] arr = {1,1,2,2,3,4,5,5,6,6};
        Map<Integer, Integer> dataMap = new HashMap<>();

        for(int i=0;i< arr.length;i++){
            if(dataMap.containsKey(arr[i]))
                dataMap.put(arr[i], dataMap.get(arr[i])+1);
            else
                dataMap.put(arr[i], 1);
        }
        System.out.println(dataMap);
        Set<Map.Entry<Integer, Integer>> keyData = dataMap.entrySet();
        for(Map.Entry<Integer, Integer> en : keyData) {
            if (en.getValue() == 1)
                System.out.println(en.getKey()+" ");
        }
    }
}
