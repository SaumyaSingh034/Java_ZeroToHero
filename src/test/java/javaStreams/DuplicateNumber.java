package javaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumber {

    public static void main(String[] args){
        Integer[] data = {1,2,2,3,3,3,3,3,3,3,3,3,3,3,6,7,7,7,7,7,7,7,8,9,9,9,9,0};
        printDuplicateNumberWithoutJavaStreams(data);
        printDuplicateNumberWithJavaStreams(data);

    }

    private static void printDuplicateNumberWithJavaStreams(Integer[] data) {
        List<Integer> dataList = Arrays.asList(data);
        Set<Integer> dup = dataList.stream().filter(e -> Collections.frequency(dataList, e)>1).collect(Collectors.toSet());
        System.out.println(dup);

    }

    private static void printDuplicateNumberWithoutJavaStreams(Integer[] data) {
        Map<Integer, Integer> dataHash = new HashMap<>();
        for(int i=0;i< data.length;i++){
            if(dataHash.containsKey(data[i])){
                dataHash.put(data[i], dataHash.get(data[i])+1);
            }
            else{
                dataHash.put(data[i], 1);
            }
        }
        System.out.println(dataHash);


    }
}
