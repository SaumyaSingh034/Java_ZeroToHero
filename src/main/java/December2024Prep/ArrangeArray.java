package December2024Prep;

import java.util.*;

public class ArrangeArray {
    public static void main(String[] args){
        String[] input = {"Jithin", "Arunima", "Akhil", "Matthew", "Benjamin"};
        sortArrayByStrLength(input);
    }

    private static void sortArrayByStrLength(String[] input) {
        List<String> names = new ArrayList<>(Arrays.asList(input));
        Comparator<String> comp = (name1, name2) ->(name1.length()>name2.length())?1:-1;
        Collections.sort(names, comp);
        System.out.println(names);
    }
}
