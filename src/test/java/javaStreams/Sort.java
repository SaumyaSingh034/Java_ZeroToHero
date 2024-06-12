package javaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args){
        Integer[] data = {1,2,35,66,5,90,1990,002,9,-1,-80};
        printInSortingOrder(data);

    }

    private static void printInSortingOrder(Integer[] data) {
        List<Integer> list = Arrays.asList(data);
        System.out.println("Ascending Order : "+list.stream().sorted().collect(Collectors.toList()));
        System.out.println("Descending Order : "+list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

    }
}
