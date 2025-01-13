package January2025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElement {
    public static void main(String[] args){
        Integer[] a1 = {1,2,3,2,1};

        Integer[] a2 = {1,2,3};

        Integer[] a3 = {1,2,3,4};

        findCommonElement(a1, a2, a3);
    }

    private static void findCommonElement(Integer[] a1, Integer[] a2, Integer[] a3) {
        Set<Integer> set1 = Arrays.stream(a1).collect(Collectors.toSet()) //Remove duplicates
                .stream()
                .filter( x -> Arrays.asList(a2).contains(x))
                .filter(x -> Arrays.asList(a3).contains(x))
                .collect(Collectors.toSet());
        System.out.println(set1);
    }
}
