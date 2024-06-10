package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {

    public static void main(String[] args) {
        Integer[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        oddEvenWithoutJavaStreams(number);
        oddEvenWithJavaStreams(number);
    }

    private static void oddEvenWithJavaStreams(Integer[] number) {
        List<Integer> list = Arrays.asList(number);
        List<Integer> evenList = list.stream()
                .filter(e-> e%2==0)
                .collect(Collectors.toList());
        System.out.println("Even List with Java STreams : "+evenList);

        List<Integer> oddList =list.stream()
                .filter(e -> e%2!=0)
                .collect(Collectors.toList());
        System.out.println("Odd List with Java STreams : "+oddList);

    }

    private static void oddEvenWithoutJavaStreams(Integer[] number) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even.add(number[i]);
            } else {
                odd.add(number[i]);
            }

        }
        System.out.println("Odd Numbers without Java Stream is : " + odd);
        System.out.println("Even Numbers without Java Stream is : " + even);
    }
}