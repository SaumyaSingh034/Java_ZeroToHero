package javaStreams;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args){
        Integer arr[] = {3, 5, 7, 9, 1,7,8,9,7,8,9,11,23,34};
        double average1 = avgWithJavaStreams(arr);
        System.out.println("Average of Numbers is : "+average1);
        double average2 = avgWithoutUsingJavaStreams(arr);
        System.out.println("Average of  Numbers is : "+average2);
    }

    private static double avgWithoutUsingJavaStreams(Integer[] arr) {
        int count=0;
        int sum=0;
        double avg;
        for(int i=0;i <arr.length;i++){
            sum +=arr[i];
            count++;
        }
        avg = sum/count;
        return avg;
    }

    private static double avgWithJavaStreams(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        return list.stream().mapToInt(e->e).average().getAsDouble();
    }
}
