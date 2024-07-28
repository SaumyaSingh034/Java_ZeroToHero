package basicJavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestElementInArray {

    public static void main(String[] args){
        Integer[] arr = {2,33,44,55,66,77,88,99};
        largestElementInArray(arr);
        largestElementInArrayUsingJavaStreams(arr);
    }

    private static void largestElementInArrayUsingJavaStreams(Integer[] arr) {
        List<Integer> data = Arrays.asList(arr);
        int maxData = data.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxData);
    }

    private static void largestElementInArray(Integer[] arr) {
        int max = arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(max<arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }
}
