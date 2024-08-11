package SDETInvertiewQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrint {

    public static void main(String[] args) {
        HashMap<String, Integer> hmData = new HashMap<>();
        hmData.put("Bangalore", 500);
        hmData.put("Chennai", 890);
        hmData.put("Hyderabad", 566);
        hmData.put("Mumbai", 788);
        hmData.put("New Delhi", 1000);

        for (Map.Entry<String, Integer> entry : hmData.entrySet()) {
            System.out.println(entry.getKey() + " total distance is --> " + entry.getValue());
        }
    }
}
