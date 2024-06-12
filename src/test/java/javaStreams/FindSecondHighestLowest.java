package javaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondHighestLowest {
    public static void main(String[] args){
        Integer[] data = {1,2,35,66,5,90,1990,002,9,-1,-80};
        secondHighestLowest(data);

    }

    private static void secondHighestLowest(Integer[] data) {
        List<Integer> list = Arrays.asList(data);
        System.out.println("Second Highest : "+list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get());
        System.out.println("Second Lowest : "+list.stream().sorted().distinct().skip(1).findFirst().get());
    }
}
