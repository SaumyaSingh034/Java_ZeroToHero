package linkedIn;

import java.util.Arrays;

public class MaxArrayElement {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,7,8,8};
        int[] arr2 = {9,8,19};
        SecondMaxElementInArray(arr);
        SecondMaxElementInArray(arr1);
        SecondMaxElementInArray(arr2);
    }

    private static void SecondMaxElementInArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
