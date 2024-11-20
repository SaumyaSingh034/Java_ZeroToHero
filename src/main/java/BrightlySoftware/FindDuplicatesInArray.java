package BrightlySoftware;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        Map<Integer, Integer> duplicateArr = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            duplicateArr.put(arr[i], duplicateArr.getOrDefault(arr[i],0)+1);
        }
        System.out.println(duplicateArr);

        for(Map.Entry<Integer, Integer> hm : duplicateArr.entrySet()){
            if(hm.getValue()>1){
                System.out.println(hm.getKey());
            }
        }
    }
}
