package SDETInvertiewQuestions;

import java.util.ArrayList;

public class ArrayListData {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Test1");
        arr.add("Test2");
        arr.add("Test3");
        arr.add("Test4");
        arr.add("Test5");

        int index = arr.indexOf("Test2");
        arr.set(index,"ReplacedTest");
        System.out.println(arr);

    }
}
