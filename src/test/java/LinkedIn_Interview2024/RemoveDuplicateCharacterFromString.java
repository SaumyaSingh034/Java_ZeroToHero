package LinkedIn_Interview2024;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromString {

    private static void removeDuplicateChar(String str){
        char[] ch = str.toCharArray();
        HashSet<Character> hashChar = new HashSet<>();
        for(Character c : ch)
            hashChar.add(c);

        for(Character c : hashChar)
            System.out.print(c);
    }

    static void removeDuplicates(String str)
    {
        //Create LinkedHashSet of type character
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        //Add each character of the string into LinkedHashSet
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));

        // print the string after removing duplicate characters
        for(Character ch : set)
            System.out.print(ch);
    }

    public static void main(String[] args){
       removeDuplicateChar("Java is best programming language");
       System.out.println("");
        removeDuplicates("Java is best programming language");
    }


}
