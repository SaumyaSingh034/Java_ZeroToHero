package InterviewPrep2024;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {
    public static void main(String[] args) {
        // Initialize two ArrayLists
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // Add elements to list1
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Grapes");

        // Add elements to list2
        list2.add("Banana");
        list2.add("Kiwi");
        list2.add("Orange");
        list2.add("Pineapple");
        List<String> commonList = new ArrayList<>(list1);
        commonList.retainAll(list2);
        System.out.println(commonList);
    }
}
