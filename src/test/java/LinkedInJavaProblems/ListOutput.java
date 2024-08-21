package LinkedInJavaProblems;

import java.util.ArrayList;
import java.util.List;

public class ListOutput {
    public static void main(String[] args){
        List<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add(1, "C");
        data.add("D");
        System.out.println(data);
    }
}
