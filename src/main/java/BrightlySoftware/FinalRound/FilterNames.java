package BrightlySoftware.FinalRound;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Tim");
        List<String> fName = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        System.out.println(fName);

        List<String> words = Arrays.asList("apple", "pear", "banana", "kiwi");
        words.sort((a,b) -> Integer.compare(a.length(), b.length()));
        System.out.println(words);

    }
}
