package vimoInterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverse {
    public static void main(String[] args){
        int[] inputArr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(inputArr));
        List<Integer> data = new ArrayList<>();

        for(int i= inputArr.length-1;i>=0;i--){
            data.add(inputArr[i]);
        }
        System.out.println(data);
    }
}
