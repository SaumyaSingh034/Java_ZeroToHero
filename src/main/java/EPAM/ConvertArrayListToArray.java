package EPAM;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args){
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        List<String> arr3 = new ArrayList<>();
        arr1.toArray();
        arr3.addAll(arr1);
        arr3.addAll(arr2);
    }
}
