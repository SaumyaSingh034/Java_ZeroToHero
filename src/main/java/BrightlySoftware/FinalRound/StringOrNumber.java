package BrightlySoftware.FinalRound;

public class StringOrNumber {
    public static void main(String[] args) {
        String str = "23"; // Input can be changed to test other cases, e.g., "23"

        processInput(str);
    }

    private static void processInput(String str) {
        if(isNum(str)){
            int sum = calculateSum(str);
            System.out.println(sum);
        }
        else {
            System.out.println(str);
        }
    }

    public static boolean isNum(String str){
        return str.matches("\\d+");
    }

    public static int calculateSum(String str){
        char[] ch = str.toCharArray();
        int sum = 0;
        for(char c : ch){
            sum = sum +Character.getNumericValue(c);
        }
        return sum;
    }
}