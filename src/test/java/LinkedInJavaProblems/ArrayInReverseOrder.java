package LinkedInJavaProblems;

import java.util.Arrays;

public class ArrayInReverseOrder {
    public static void main(String[] args){
        int[] arr = {3,5,44,44,55,3,5,44,44,44,44,9,7,6,5,55,6};
        Arrays.sort(arr);
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
