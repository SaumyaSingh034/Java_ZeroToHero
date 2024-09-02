package linkedIn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

public class ArraylistLinkedList {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Saumya");
        linkedList.add("Saumya");
        linkedList.add("Tryaksh");
        linkedList.add("Rahul");
        linkedList.add("Piyush");

        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1,"Saumya");
        tree.put(1,"Saumya");
      //  tree.put(null,"Saumya");
        tree.put(2,"Saumya");
       // tree.put(null,null);


        System.out.println(list);
        System.out.println(linkedList);
        System.out.println(tree);
    }
}
