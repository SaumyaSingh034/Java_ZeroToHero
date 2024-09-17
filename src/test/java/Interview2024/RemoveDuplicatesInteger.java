package Interview2024;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInteger {
    public static void main(String[] args){
        Integer arr[] = {1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,5};
       removeDuplicatesFromArray(arr);
    }

    private static void removeDuplicatesFromArray(Integer[] arr) {
        HashSet<Integer> hashInteger = new HashSet<>(Arrays.asList(arr));
        System.out.println(hashInteger);

    }
}
