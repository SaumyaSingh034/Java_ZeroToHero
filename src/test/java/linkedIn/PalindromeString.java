package linkedIn;

public class PalindromeString {

    public static void main(String[] args){
        PalindromeString ps = new PalindromeString();
        ps.StringPalindrome("121");
        ps.StringPalindrome("madam");
        ps.StringPalindrome("");
        ps.StringPalindrome("InterviewPrep.A");
        ps.StringPalindrome("Ana");
        ps.StringPalindrome("Saumya");
    }

    protected void StringPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(rev.equalsIgnoreCase(str)){
            System.out.println("Palindrome String : String --> "+str+" Revsre String : "+rev);
        }
        else{
            System.out.println("Not Palindrome String : String --> "+str+" Revsre String : "+rev);
        }
    }
}
