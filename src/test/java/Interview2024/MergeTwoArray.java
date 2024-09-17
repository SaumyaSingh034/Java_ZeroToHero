package Interview2024;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {

    public static void main(String[] args){
        int[] arr1 = {0,3,4,31};
        int[] arr2 = {4,6,30};
        List<Integer> dataList = new ArrayList<>();
        for(Integer n : arr1){
            dataList.add(n);
        }
        for(Integer n : arr2){
            dataList.add(n);
        }
        System.out.println(dataList);
        Object[] arr3 = dataList.toArray();
       Arrays.sort(arr3);
       for(Object o : arr3)
           System.out.print(o+" ");


    }
}
