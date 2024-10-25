package YoutubeJavaInterview;

import java.util.HashSet;

public class LongestSubstringWithRepeatingChar {

    public static int longestSubstring(String str){
        HashSet<Character> uniqueChars = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int i=0;i<str.length();i++){
            while(uniqueChars.contains(str.charAt(i))){
                uniqueChars.remove(str.charAt(left));
                left++;
            }
            uniqueChars.add(str.charAt(i));
            maxLength = Math.max(maxLength, i-left+1);
        }
        System.out.println(uniqueChars);
        return maxLength;
    }

    public static void main(String[] args){
        String str = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: "
                + longestSubstring(str));
    }

}
