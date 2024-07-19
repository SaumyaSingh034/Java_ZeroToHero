package javaInterviewPrep;

public class CheckVowelIsPresent {

    public static void main(String[] args){
        String s = "Saumya";
        System.out.println(checkVowelIsPresent(s));
    }

    private static boolean checkVowelIsPresent(String s) {
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
