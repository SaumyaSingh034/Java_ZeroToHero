package January2025;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr = {2,3,4,2,3,4,5,5,6,7,8,8};
        removeDuplicatesArr(arr);

    }

    private static void removeDuplicatesArr(int[] arr) {
        Set<Integer> data = new LinkedHashSet<>();
        for(int i=0;i< arr.length;i++){
            data.add(arr[i]);
        }

        System.out.println(Arrays.asList(data.toArray()));

    }
}
