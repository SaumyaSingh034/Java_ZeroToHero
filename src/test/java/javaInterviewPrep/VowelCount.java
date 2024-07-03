package javaInterviewPrep;

import java.util.function.IntPredicate;

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

        System.out.println("Using Java Streams");
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
                ||t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
            }
        };
        String test = "aeiouAEIOU";
        long vCount = test.chars().filter(vowel).count();
        System.out.println(vCount);



    }

    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u';
    }
}
