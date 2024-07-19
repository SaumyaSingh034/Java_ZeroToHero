package javaInterviewPrep;

public class reverseString {

    public static void main(String[] args){
        String s = "Saumya Singh";

        reverseUsingString(s);
    }

    private static void reverseUsingString(String s) {
        String s1 = "";
        char[] ch = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            s1 = s1+ch[i];
        }
        System.out.println(s1);
    }
}
