package January2025;

import java.util.HashSet;
import java.util.Set;

public class PrintLargestNumber {
    public static void main(String[] args){
        int[] arr={4,3,2,7,3,4,8,8};
        removeDuplicatesFindLargest(arr);

    }

    private static void removeDuplicatesFindLargest(int[] arr) {
        Set<Integer> data = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            data.add(arr[i]);
        }

        int max = 0;
        for(int e : data){
            if(e>max){
                max = e;
            }
        }
        System.out.println(max);
    }
}
