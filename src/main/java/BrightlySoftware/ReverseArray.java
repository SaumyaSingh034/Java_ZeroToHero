package BrightlySoftware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i= arr.length-1;i>=0;i--){
          arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
        Object[] rev = arrayList.toArray();
        System.out.print(Arrays.toString(rev));
    }
}
