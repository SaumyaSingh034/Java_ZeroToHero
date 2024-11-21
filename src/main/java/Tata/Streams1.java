package Tata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John","Jane","Tom","Tim");
        List<String> GilteredNames = names.stream()
                .filter(name -> name.startsWith("T"))
                .collect(Collectors.toList());

        System.out.println(GilteredNames);
        List<String> words = Arrays.asList("apple", "pear", "banana", "kiwi");

        words.sort((a,b) -> Integer.compare(a.length(), b.length()));

    }
}
