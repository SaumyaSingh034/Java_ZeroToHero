package Interview2024;

import java.util.Arrays;

public class OddToLeftEvenToRight {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        arrayManipulation(arr);
    }

    private static void arrayManipulation(int[] arr) {
        int result[] = new int[arr.length];
        int j=0;
        int lastIndex = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[j++] = arr[i];
            }else{
               result[lastIndex--] = arr[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
