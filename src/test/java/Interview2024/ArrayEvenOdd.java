package Interview2024;

import java.util.Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args){
        int[] arr = {3,5,7,4,8,2};
        shiftArrayEvenOdd(arr);

    }

    private static void shiftArrayEvenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int j=0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]%2==0){
                result[j++] = arr[i];
            }
        }
        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2!=0){
                result[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
