package javaInterviewPrep;

public class StringPalindrome {

    public static void main(String[] args){
        String s1 = "madam";
        palindromeString(s1);
        palindromeString("saumya");
        palindromeString("anana");
    }

    private static void palindromeString(String s1) {
        StringBuffer sb = new StringBuffer(s1);
        if(s1.equalsIgnoreCase(sb.reverse().toString()))
            System.out.println("Palindrome String : "+s1+" Reverse String: "+sb.toString());
        else
            System.out.println("Not a Palindrome String : "+s1+" Reverse String: "+sb.toString());
    }
}
