package December2024Prep;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String str = "Bananas";
        System.out.println(longestPalindromeStr(str));
    }

    private static int longestPalindromeStr(String str) {

        int len = str.length();
        int maxLen = 1, start = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                //Check Palindrome
                for (int n = 0; n < (j - i + 1) / 2; n++) {
                    if (str.charAt(i + n) != str.charAt(j - n))
                        flag = 0;
                    if (flag != 0 && (j - i + 1) > maxLen) {
                        start = i;
                        maxLen = j - i + 1;
                    }
                }
            }


        }
        System.out.println("Longest palindromic substring in given string is: ");
        printSubStr(str, start, start + maxLen - 1);
        return maxLen;

    }

    private static void printSubStr(String s, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(s.charAt(i));
    }
}
