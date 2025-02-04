package IMP_InterviewQuestions;

public class Question1 {
    public static void main(String[] args){
        // VIMO FITMENT
        /*For given string check if the string contains
        >> vowels and the length of string is greater than 5 print success
        >> if the length of string is less than 5 print failure
        >> if the length of string and vowels characters length are same print failure

         */

        String str = "Hello Saumya";
        String str1 = "Saum";
        String str2 = "ttytttttttttyyyty";
        checkVowelStringData(str);
        checkVowelStringData(str1);
        checkVowelStringData(str2);
    }

    private static void checkVowelStringData(String str) {
        if(str.length() > 5 && containsVowels(str)){
            System.out.println("Success");
        } else if (str.length() < 5) {
            System.out.println("Failure");

        }else{
            System.out.println("Failure");
        }
    }

    private static boolean containsVowels(String str) {
        for(char c : str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1)
                return true;
        }
        return false;
    }

}
