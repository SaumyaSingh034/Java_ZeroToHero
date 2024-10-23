package InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class FilterArray {

    public static void main(String[] args){
        String[] input = {"Sunday","Monday","Tuesday","Thursday","Friday","Saturday","Sunday"};
        List<String> weekDays = new ArrayList<>();
        for(String week : input){
           weekDays.add( week.substring(0,3));
        }
       System.out.println(weekDays);
    }
}
