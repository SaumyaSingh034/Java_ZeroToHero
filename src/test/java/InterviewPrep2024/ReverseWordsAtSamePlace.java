package InterviewPrep2024;

public class ReverseWordsAtSamePlace {
    public static void main(String[] args){
        String str = "Test Automation";
        System.out.println(reverseWordsAtSame(str));
    }

    private static String reverseWordsAtSame(String str) {
        StringBuffer sb = new StringBuffer();
        String[] s = str.split(" ");
        for(String i : s){
            StringBuffer word = new StringBuffer(i);
            sb.append(word.reverse()).append(" ");
        }
        return sb.toString().trim();
    }
}
