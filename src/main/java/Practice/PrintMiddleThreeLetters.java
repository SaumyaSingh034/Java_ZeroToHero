package Practice;

public class PrintMiddleThreeLetters {
    public static void main(String[] args){
        String str = "NewMumbai";
        String output = getThreeLettersFromString(str);
        System.out.println(output);
    }

    private static String getThreeLettersFromString(String str) {
        if(str.length()<=3)
            return str;
        else if (str.length()%2==0) {
            return "";
        }else{
            int middleLength = str.length()/2;
            return str.substring(middleLength-1,middleLength+2);
        }
    }
}
