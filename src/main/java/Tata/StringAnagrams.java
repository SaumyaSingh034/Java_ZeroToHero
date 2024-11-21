package Tata;

import java.util.Arrays;

public class StringAnagrams {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        else{
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
}
