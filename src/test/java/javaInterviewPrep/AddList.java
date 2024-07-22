package javaInterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class AddList {

    public static void main(String[] args){
        List<String> l1 = new ArrayList<>();
        l1.add("Saumya");
        List<String> l2 = new ArrayList<>();
        l2.add("Singh");

        List<String> mergedList = new ArrayList<>(l1);
        mergedList.addAll(l2);
        System.out.print(mergedList);
    }
}
