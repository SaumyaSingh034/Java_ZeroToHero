package BrightlySoftware.FinalRound;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "Silent";
       System.out.println( anagaram(s1, s2));
    }

    private static boolean anagaram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
