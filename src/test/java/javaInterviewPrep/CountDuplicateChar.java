package javaInterviewPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateChar {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "S";
        String s3 = "Hello World This is Saumya";
        countDuplicateChar(s1);
        countDuplicateChar(s2);
        countDuplicateChar(s3);
    }

    public static void countDuplicateChar(String str){
        if(str == null){
            System.out.println("String is NULL");
            return;
        }
        if(str.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if(str.length() == 1){
            System.out.println("String contains Single Char");
            return;
        }
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c : ch){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }
            else{
                charMap.put(c, 1);
            }
        }


        Set< Map.Entry<Character, Integer>> charSet = charMap.entrySet();
        for(Map.Entry<Character,Integer> entry : charSet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" -> "+entry.getValue());
            }
        }
    }
}
