package vimoInterviewPreparation;

import java.util.Arrays;

public class TwoAnagramStrings {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("abc", "bca")); // true
        System.out.println(isAnagram("abc", "ccb")); // false
        System.out.println(isAnagram("aaa", "aaab")); // false

        System.out.println("********************");

        System.out.println(isAnangram1("listen", "silent")); // true
        System.out.println(isAnangram1("triangle", "integral")); // true
        System.out.println(isAnangram1("abc", "bca")); // true
        System.out.println(isAnangram1("abc", "ccb")); // false
        System.out.println(isAnangram1("aaa", "aaab")); // false
    }

    private static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()!=s2.length())
            return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    public static boolean isAnangram1(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()!=s2.length())
            return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        for(int i=0;i< ch1.length;i++){
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }

}
