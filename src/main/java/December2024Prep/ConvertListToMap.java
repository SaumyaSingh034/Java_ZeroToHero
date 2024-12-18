package December2024Prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args){
        List<String> listMap = Arrays.asList("Saumya","Rahul","Tryaksh","Piyush","Palak","Nitin","Amit");
        Map<String, Integer> hm = listMap
                .stream().collect(Collectors.toMap(name-> name, name->name.length()));
        System.out.println(hm);
    }
}
