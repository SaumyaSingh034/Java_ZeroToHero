package EPAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] arr1 = {0, 30, 5, 6, 0, 0, 9, 27};
        moveZerosToFront(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    private static void moveZerosToFront(int[] arr1) {
        int length = arr1.length;;
        int nonZeroIndex = length-1;
        for(int i=length-1;i>=0;i--){
            if(arr1[i]!=0){
                arr1[nonZeroIndex] = arr1[i];
                nonZeroIndex--;
            }
        }
        while(nonZeroIndex>=0){
            arr1[nonZeroIndex] = 0;
            nonZeroIndex--;
        }
    }
}
