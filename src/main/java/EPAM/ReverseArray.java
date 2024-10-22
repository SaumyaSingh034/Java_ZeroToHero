package EPAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,10};
        List<Integer> reverse = new ArrayList<>();
        for(int i= arr.length-1;i>=0;i--){
            reverse.add(arr[i] );
        }
        System.out.println(reverse);
    }
}
