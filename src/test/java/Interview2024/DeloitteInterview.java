package Interview2024;

public class DeloitteInterview {
    public static void main(String[] args){
        String str1 = "2";
        String str2 = "InterviewPrep.A";
       System.out.println( printAppropriateResult(str1,str2));
       System.out.println( printAppropriateResult("3","5"));
       System.out.println( printAppropriateResult("Saumya ","Rahul"));
    }

    private static String printAppropriateResult(String str1, String str2) {
        if(isDigit(str1) && isDigit(str2)){
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            return String.valueOf(a+b);
        }
        else if(isDigit(str1) && isAlphabet(str2) || isDigit(str2) && isAlphabet(str1)|| isAlphabet(str1)&&isAlphabet(str2))
            return str1+str2;
       else
           return "Invalid Input";
    }

    private static boolean isDigit(String str){
        return str.matches("\\d");
    }

    private static boolean isAlphabet(String str){
        return str.matches("[a-zA-Z]");
    }
}
