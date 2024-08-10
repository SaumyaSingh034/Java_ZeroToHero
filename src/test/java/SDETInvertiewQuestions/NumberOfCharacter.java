package SDETInvertiewQuestions;

import java.util.HashMap;

public class NumberOfCharacter {

    public static void main(String[] args){
        String s2 = "Saumya";
        String s1 = "JavaProgramming";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s1.length();i++){
           if(hm.containsKey(s1.charAt(i)))
               hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
           else
               hm.put(s1.charAt(i),1);
        }

        System.out.println(hm);
    }
}
