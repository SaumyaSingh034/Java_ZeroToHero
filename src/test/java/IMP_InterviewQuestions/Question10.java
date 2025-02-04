package IMP_InterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question10 {
    public static void main(String[] args){
        //OSTTRA -->
        /*
        Reverse Only Strings
         */
        String str = "34test909gda@sdet123pro";
        //* ChatGPT Logic
        reverseOnlyString(str);

        //Another easiest logic
        reverseOnlyStringUsingChat(str);


        //I Tried
        String stringOnly = str.replaceAll("[^a-zA-Z@]"," ");
        String number = str.replaceAll("[^0-9]"," ");
//        System.out.println(stringOnly);
//        System.out.println(number);
        StringBuffer result = new StringBuffer();
        for(String s : stringOnly.split(" ")){
            StringBuffer data = new StringBuffer(s);
            result.append(data.reverse()).append(" ");
        }
        StringBuffer resultString = new StringBuffer();
        String[] num = number.trim().split(" ");
        String[] strs = result.toString().split(" ");
        int j=0;
        for(int i=0;i<strs.length;i++){
                if (num[i].equals("")) {
                    resultString.append(strs[j++]);
                } else {
                    resultString.append(num[i]);
            }
        }

        System.out.println(resultString);

    }

    private static String reverseOnlyStringUsingChat(String str) {
        String[] parts = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            if (part.matches("[a-zA-Z]+")) {
                result.append(new StringBuilder(part).reverse());
            } else {
                result.append(part);
            }
        }
        System.out.println(result);

        return result.toString();
    }

    private static void reverseOnlyString(String str) {
        Matcher match = Pattern.compile("[a-zA-Z]+").matcher(str);
        StringBuffer sb = new StringBuffer();
        while(match.find()){
            match.appendReplacement(sb, new StringBuilder(match.group())
                    .reverse().toString());
        }
        match.appendTail(sb);
        System.out.println(sb.toString());

    }


}
