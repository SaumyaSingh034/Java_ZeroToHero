package Interview2024;

import java.util.Arrays;

public class ShiftZeroToRight
{
    public static void main(String[] args){
        int arr[] = {0,3,0,5,0,7,0,8,1,4,5,0,9,12,0};
        shiftAllZeroToRight(arr);
    }

    private static void shiftAllZeroToRight(int[] arr) {
        int result[] = new int[arr.length];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){

                result[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
