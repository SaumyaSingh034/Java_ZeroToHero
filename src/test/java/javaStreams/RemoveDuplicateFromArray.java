package javaStreams;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray {

    public static void main(String[] args){
        List<Integer> myList = List.of(0,1,2,3,5,6,0,0,1);
        System.out.println(myList.size());
        Object[] myList1 = myList.stream().distinct().toArray();
        System.out.println(myList1.length);
       // List<Integer> newList = new ArrayList<>(myList1);
    }
}
