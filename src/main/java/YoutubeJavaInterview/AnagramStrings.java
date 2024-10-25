package YoutubeJavaInterview;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args){
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println(checkAnagramString(str1,str2));
    }

    private static boolean checkAnagramString(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll(" ", "");
        str2 = str2.toLowerCase().replaceAll(" ", "");
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
