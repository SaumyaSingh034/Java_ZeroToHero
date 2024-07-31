package JavaInterviewQuestions;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "Saumya Singh";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("data"));
        System.out.println(isPalindrome("51515"));
    }

    private static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse))
            return true;
        else return false;
    }
}
