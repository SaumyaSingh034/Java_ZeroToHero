package AbstractInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 8}; //3,1,7,8,2

        int length = arr.length;
        int[] data = new int[length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                data[arr.length-i] = arr[i];
            }else{
                data[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(data));
    }


}
