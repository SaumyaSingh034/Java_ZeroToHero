package BrightlySoftware.FinalRound;

public class StringManipulationRegex {
    public static void main(String[] args) {
        String str1 = "2";  // Input 1
        String str2 = "8";  // Input 2

        String result = processStrings(str1, str2);
        System.out.println("Result: " + result);
    }


    private static String processStrings(String str1, String str2) {
        if(isDigit(str1) && isDigit(str2)){
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            return String.valueOf(num1+num2);
        } else if (isAlphabet(str1) && isDigit(str1)) {
            return str1+str2;
            
        } else if (isDigit(str1)&& isAlphabet(str2)) {
            return str1+str2;

        }else
            return "Invalid";

    }

    public static boolean isDigit(String str){
        return str.matches("\\d");

    }

    public static boolean isAlphabet(String str){
        return str.matches("[a-zA-Z]");
    }

}
