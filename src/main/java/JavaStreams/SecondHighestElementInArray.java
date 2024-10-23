package JavaStreams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElementInArray {
    public static void main(String[] args){
        int[] numbers = {13,45,62,9,90,32,101};

        Integer number = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(number);
    }
}
