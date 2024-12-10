package InterviewPrep2024;

public class StringManipulation1 {
    public static void main(String[] args){
        String str1 = "2";
        String str2 = "6";
        String result = processString(str1, str2);
        System.out.println(result);
    }

    private static String processString(String str1, String str2) {
        if(isDigit(str1)&&isDigit(str2)){
            int a = Integer.valueOf(str1) ;
            int b = Integer.valueOf(str2);
            return String.valueOf(a+b);
        }
        else if((isDigit(str1) && isAlphabet(str2)) || (isAlphabet(str1) && isDigit(str2)))
        {
            return str1+str2;
        }else
           return "Invalid Input";
    }

    private static boolean isDigit(String str){
        return str.matches("\\d");
    }

    private static boolean isAlphabet(String str){
        return str.matches("[a-zA-Z]");
    }
}
