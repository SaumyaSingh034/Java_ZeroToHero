package January2025;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberSlidingWindow {
    public static void main(String[] args){
       int arr[] = {1, -1, 3, 4, -5, 6, -8, 5, -6};
       int arr1[] = {1, -1, -3, 4, -5, -6, -8, 5, -6};
       int n = 3;
       int length = arr.length;
       firstNegativeNumberSliding(arr1, n, length);
    }

    private static void firstNegativeNumberSliding(int[] arr, int n, int length) {

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<length;i+=n){
            int left = i;
            int right = Math.min(i+n-1,length-1);

            while(left<right){
                if(arr[left]<0){
                    result.add(arr[left]);
                    break;
                }
                left++;
            }
        }
        System.out.println(result);
    }
}
