package javaInterviewPrep;

public class VowelCount {

    public static void main(String[] args) {
        String s1 = "Saumya Rahul";
        String s = "a";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                count++;
        }
        System.out.println("Typical Java Method "+ count);


    }

    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u';
    }
}
