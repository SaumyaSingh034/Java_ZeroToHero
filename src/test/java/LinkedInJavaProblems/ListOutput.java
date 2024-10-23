package LinkedInJavaProblems;

import java.util.ArrayList;
import java.util.List;

public class ListOutput {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("InterviewPrep.A");
        data.add("InterviewPrep.B");
        data.add(1, "InterviewPrep.C");
        data.add("D");
        System.out.println(data);
    }
}
