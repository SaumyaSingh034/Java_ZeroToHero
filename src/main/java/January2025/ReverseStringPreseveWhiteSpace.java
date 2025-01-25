package January2025;

public class ReverseStringPreseveWhiteSpace {
    public static void main(String[] args){
        String str = "Saumya Singh is a new Software Qualtiy Automation Engineer . ";
        reverseStringNew(str);
    }

    private static void reverseStringNew(String str) {
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result.trim());
    }
}
