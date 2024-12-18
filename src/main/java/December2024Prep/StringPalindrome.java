package December2024Prep;

public class StringPalindrome {
    public static void main(String[] args){
        String str = "level";
        String str1 = "Scaler";
        System.out.println(printPalindromeString(str1));
    }

    private static boolean printPalindromeString(String str) {
        String reverse = "";
        String actual = str;
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reverse : "+reverse);
        System.out.println("Actual : "+actual);
        return reverse.equalsIgnoreCase(actual);
    }
}
