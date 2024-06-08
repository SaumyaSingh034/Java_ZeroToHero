package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSumOfAllNumbers {

    public static void main(String[] args){
        Integer arr[] = {3, 5, 7, 9, 1,7,8,9};
        int sum1 = withJavaStreams(arr);
        System.out.println("Sum of all Numbers is : "+sum1);
        int sum2 = withoutUsingJavaStreams(arr);
        System.out.println("Sum of all Numbers is : "+sum2);
    }

    private static int withoutUsingJavaStreams(Integer[] arr) {
        int sum =0;
        for(int i=0;i< arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    private static int withJavaStreams(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Optional<Integer> sum = list.stream().reduce((a, b) -> a+b);
        return sum.get();
    }
}
