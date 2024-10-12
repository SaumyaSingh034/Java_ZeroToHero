package vimoInterviewPreparation;

public class CheckIfVowels {
    public static void main(String[] args){
        System.out.println(stringContainsVowel("Hello"));
        System.out.println(stringContainsVowel("SDFRTY"));
    }

    private static boolean stringContainsVowel(String str) {
        return str.matches(".*[aeiou].*");
    }
}
