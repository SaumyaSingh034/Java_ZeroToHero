package EPAM;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AverageHashMap {
    public static void main(String[] args){
        HashMap<String, Integer> data = new HashMap<>();
        data.put("Brian",21);
        data.put("Lee",22);
        data.put("Cathe",45);
        double avg;
        int sum=0;
        int count=0;

        for(Map.Entry<String, Integer> dataSet: data.entrySet()){
            sum += dataSet.getValue();
            count++;

        }
        avg = sum/count;
        System.out.println("Average of the age is : "+avg);

    }
}
