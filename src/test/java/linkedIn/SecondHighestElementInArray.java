package linkedIn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestElementInArray {

    public static void main(String[] args){
        Integer a[] = {1,2,5,6,3,2};
        Integer b[] = {44,66,99,77,33,22,55};
        System.out.println(getSecondHighestElement(a));
        System.out.println(getSecondHighestElement(b));

    }

    public static int getSecondHighestElement(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int len = arr.length;
        int element = list.get(len-2);
        return element;
    }
}
