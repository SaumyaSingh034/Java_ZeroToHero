package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaList {

    public static void main(String[] args){
        List<Integer> data = new ArrayList<>();
        data.add(12);
        data.add(0);
        data.add(1);
        data.add(78);
        data.add(12);


        data.add(5, 23);

        data.remove(0);
        System.out.println(data.stream().map(Object::toString).collect(Collectors.joining(" ")));

    }
}
