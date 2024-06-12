package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

    public static void main(String[] args){
        Integer[] data = {1,2,3,4,5,6,7,8,9,10};
        limitSkipNumberwithoutJavaStreams(data);
        limitSkipNumberwithJavaStreams(data);
    }

    private static void limitSkipNumberwithJavaStreams(Integer[] data) {
        List<Integer> list = Arrays.asList(data);
        System.out.println(list.stream().limit(5).collect(Collectors.toList()));
       int sum =  list.stream().limit(5).reduce((p,q)-> p+q).get();
       System.out.println(sum);
       System.out.println(list.stream().skip(5).collect(Collectors.toList()));
       int skip = list.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println(skip);
    }

    private static void limitSkipNumberwithoutJavaStreams(Integer[] data) {
        int sum = 0, skipSum=0;
        List<Integer> list = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(i==5)
                break;
            else{
                list.add(data[i]);
                sum +=data[i];
            }
        }
        for(int i=0;i<data.length;i++){
            if(i<5){
                continue;
            }
            else{
                skipList.add(data[i]);
                skipSum +=data[i];
            }
        }
        System.out.println("Limit 5 Number : "+ list);
        System.out.println("Sum of Limit 5 Number : "+ sum);
        System.out.println("Skip first 5 Number : "+ skipList);
        System.out.println("Sum of Skip 5 Number : "+ skipSum);
    }
}
