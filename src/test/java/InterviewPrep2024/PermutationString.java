package InterviewPrep2024;

public class PermutationString {

    public static void main(String[] args){
        String str = "ABC";
        generatePermutationStr(str, "");
    }

    private static String generatePermutationStr(String str, String result) {
        if(str.isEmpty()) {
            System.out.println(result);
            return result;
        }
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            generatePermutationStr(rem, result+currentChar);
        }

        return str;
    }
}
