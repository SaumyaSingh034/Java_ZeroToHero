package javaInterviewPrep;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args){
        int[] arr = {8,9,3,1,5,6,2,6,7,2,4};

        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
