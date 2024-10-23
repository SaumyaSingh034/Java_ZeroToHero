package InterviewPrep;

public class DigitChar {
    public static void main(String[] args){
        String str = "2A";

        System.out.println(isDigit(str));
        System.out.println(isAlphabet(str));

    }

    private static String isDigit(String str){
        return str.replaceAll("\\d","");
    }

    private static String isAlphabet(String str){
        return str.replaceAll("[a-zA-Z]","");
    }

}
