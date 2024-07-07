package javaInterviewPrep;

public class StringPresent {

    public static void main(String[] args){

        System.out.println(isSubstring("saumya singh","singh"));
        System.out.println(isSubstring("saumya singh"," "));
        System.out.println(isSubstring("saumya singh","rahul"));
        System.out.println(isSubstring("saumya singh","h"));
    }

    private static boolean isSubstring(String main, String sub) {
        return main.matches("(.*)"+sub+"(.*)");
    }
}
