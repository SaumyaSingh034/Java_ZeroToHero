package December2024Prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CovertMapToList {
    public static void main(String[] args){
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Saumya", 29);
        hm.put("Tryaksh", 01);
        hm.put("Rahul",34);
        List<String> data = new ArrayList<>(hm.keySet());
        System.out.println(data);
    }
}
