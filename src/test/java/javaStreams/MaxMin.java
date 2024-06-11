package javaStreams;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args){
        Integer[] data = {1,2,35,66,5,90,1990,002,9,-1,-80};
        printMinMax(data);

    }
    public static void printMinMax(Integer[] data){
        List<Integer> list = Arrays.asList(data);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
