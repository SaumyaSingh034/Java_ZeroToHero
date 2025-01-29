package VIMO_Fitment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinVal {

    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        Integer min;
        String name;
        data.put("Rohit",30);
        data.put("Virat",27);
        data.put("Jadega",25);
        data.put("Ashwin",34);
        data.put("Shuman",31);

         min = Collections.min(data.values());
        System.out.println(min);


        Map.Entry<String, Integer> min1 = null;
        for(Map.Entry<String, Integer> m : data.entrySet()){
            if(min1 == null || m.getValue() < min1.getValue()){
                min1= m;
            }

        }
        System.out.println(min1.getKey()+" -----> "+min1.getValue());
        //String name;
        Map.Entry<String, Integer> minimum = null;
        for(Map.Entry<String, Integer> d : data.entrySet()){
            if(minimum == null || d.getValue()<minimum.getValue()){
                minimum = d;
            }
        }
        System.out.println(minimum.getKey()+ "-----> "+minimum.getValue());


    }

}
