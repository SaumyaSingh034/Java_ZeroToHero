package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {

    public static void main(String[] args){
        List<Object> list = List.of( 0, 1, 2, 3, 5, 6, 0, 0, 1 );
        System.out.println(list+" ---> "+list.size());
        list = Arrays.asList(list.stream().distinct().toArray());
        System.out.println(list+" ---> "+list.size());


    }
}
