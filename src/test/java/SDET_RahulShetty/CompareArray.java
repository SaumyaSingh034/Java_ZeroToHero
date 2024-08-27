package SDET_RahulShetty;

import java.util.ArrayList;
import java.util.List;

public class CompareArray {

    private List<Integer> compareTwoArrays(int[] arr1, int[] arr2){
        List<Integer> arr = new ArrayList<>();
        if(arr1.length == arr2.length){
            for(int i =0;i<arr1.length;i++){
                if(arr1[i] == arr2[i])
                    arr.add(arr1[i]);
                else
                    continue;
            }

        }
        else{
            System.out.println("Both array have different length");
        }
        return arr;
    }

    public static void main(String[] args){
        CompareArray com = new CompareArray();
        int[] arr1 = {1,4,5,7};
        int[] arr2 = {6,4,3,7};
        System.out.println(com.compareTwoArrays(arr1,arr2));
    }
}
