package BrightlySoftware.FinalRound;

import java.util.Arrays;
import java.util.List;

public class Streams1 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3,5,6,7,8,9);
       int max = numbers.stream().max(Integer::compareTo).get().intValue();
       int min = numbers.stream().min(Integer::compare).get().intValue();
       System.out.println(max+" "+min);
    }
}
