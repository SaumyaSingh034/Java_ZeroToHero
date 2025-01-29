package BrightlySoftware;

import java.util.Arrays;

public class ShiftAllZeroAtEnd {

    public static void main(String[] args){
        int arr[] = {1,0,3,0,1,0,5};
        moveZeroAtEnd(arr);
        test(arr);
    }
    public static void test(int[] arr){
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i=j;i< arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroAtEnd(int[] arr) {
        int j = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }

        }
        for(int i=j;i< arr.length;i++){
            arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));

    }
}
