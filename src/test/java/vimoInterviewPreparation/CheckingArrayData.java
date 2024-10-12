package vimoInterviewPreparation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckingArrayData {
    public static void main(String[] args){
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println(sameElement(a1, a2));
        System.out.println(sameElement(a1, a3));    }

    public static boolean sameElement(Object[] array1, Object[] array2){
        Set<Object> data1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> data2 = new HashSet<>(Arrays.asList(array2));

        if(data1.size()!=data2.size())
            return false;
        for(Object obj : data1) {
            if (!data2.contains(obj))
                return false;
        }

        return true;
    }
}
