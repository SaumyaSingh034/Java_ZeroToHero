package interview_14Oct_2024;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(isAnagram("Keep", "Peek"));
        System.out.println(isAnagram("Mother In Law", "Hitler Woman"));

    }

    private static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll(" ","").toLowerCase();
        s2 = s2.replaceAll(" ","").toLowerCase();

        if(s1.length()!=s2.length())
            return false;
            else{
                char[] c1 = s1.toCharArray();
                char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
}
