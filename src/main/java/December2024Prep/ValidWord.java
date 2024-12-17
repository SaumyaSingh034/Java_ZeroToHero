package December2024Prep;

public class ValidWord {
    public static void main(String[] args) {
        String word = "234Adas";
        System.out.println(isValid(word));
    }

    private static boolean isValid(String word) {
        int n = word.length();
        if (n < 3) {
            return false;
        }
        int vowels = 0;
        int constant = 0;

        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) !=-1){
                    vowels++;
                }else{
                    constant++;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }

        return vowels>=1 && constant >=1;
    }
}
