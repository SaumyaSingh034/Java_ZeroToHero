package Interview2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayBasedOnSubset {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = 3;
       int length = arr.length;;
        reverseArraySubset(arr, n, length);
        //→aOutput: [3,2,1,6,5,4,9,8,7]
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArraySubset(int[] arr, int n, int length) {
        List<Integer> data = new ArrayList<>();
       for(int i=0;i<length;i+=n){
           int left = i;

           //to handle case where n is not multiple of length
           int right = Math.min(i+n-1, length-1);
           int temp;

           //reverse Sub array[left,right]
           while(left<right){
               temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;

           }
       }
    }
}
