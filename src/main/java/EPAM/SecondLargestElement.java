package EPAM;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8,9};
        int max = 0;
        int second = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            } else if (arr[i]>second) {
                second = arr[i];

            }
        }
        System.out.println(second);
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
