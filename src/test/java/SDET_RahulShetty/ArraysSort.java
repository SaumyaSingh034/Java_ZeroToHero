package SDET_RahulShetty;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args){
        int[] arr = {3,6,8,2,4,5,1,3,7};
        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println("After Sorting --> Ascending");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println("After Sorting --> Descending");
        for(int i= arr.length-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }}
