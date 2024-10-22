package EPAM;

public class GetMiddleThreeLetters {
    public static void main(String[] args){
        String input = "NewMumbai";
        String output = getMiddleThreeLetters(input);
        System.out.println(output);
    }

    private static String getMiddleThreeLetters(String input) {
        int length = input.length();
        if(length<=3){
            return input;
        } else if (length%2==0) {
            return "";
        }else{
            int middleIndex = length/2;
            return input.substring(middleIndex-1, middleIndex+2);
        }
    }
}
