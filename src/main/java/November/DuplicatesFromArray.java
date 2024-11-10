package November;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Integer[] result = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }

    private static Integer[] removeDuplicates(int[] array) {
        Set<Integer> hm = new HashSet<>();
        for(int e : array)
            hm.add(e);
        return hm.toArray(new Integer[hm.size()]);
    }
}
