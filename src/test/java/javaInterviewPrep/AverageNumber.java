package javaInterviewPrep;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageNumber {

    public static void main(String[] args){
        int[] arr = {2,4,5,6,7,1,2,3,4,9,9,22};

        System.out.println("*************** Using Simple Java *************");
        int total=0;
        for(int i=0;i<arr.length;i++){
            total += arr[i];
        }
        int avg = total/ arr.length;
        System.out.println("Average: "+avg);
        System.out.println("************* Using Java 8 *****************");
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println("Average : "+average.getAsDouble());
        System.out.println("Using Guava Library");
    }
}
