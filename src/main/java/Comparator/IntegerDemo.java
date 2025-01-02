package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntegerDemo {
    public static void main(String[] args){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(41);
        nums.add(39);
        nums.add(13);
        nums.add(90);

        System.out.println(nums);
        Collections.sort(nums, comparator);
        System.out.println(nums);

    }

}
