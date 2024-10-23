package InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWord {

    public static void main(String[] args){
        String s1 = "I am a Software Tester";

        reverseEachWordInString(s1);
    }

    private static void reverseEachWordInString(String s1) {
        String[] array = s1.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String word : array){
            StringBuffer reverse = new StringBuffer(word);
            reverse.reverse();
            sb.append(reverse).append(" ");
        }

        System.out.println(sb);

    }
}
