package BrightlySoftware.FinalRound;

public class StringPalindrome {
    public static void main(String[] args){
        String str = "madam";
        System.out.println(palindromeString(str));
    }

    private static boolean palindromeString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(str.equals(rev))
            return true;
        else
            return false;
    }
}
