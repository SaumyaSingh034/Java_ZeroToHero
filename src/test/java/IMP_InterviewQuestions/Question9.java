package IMP_InterviewQuestions;

public class Question9 {
    public static void main(String[] args){
        //OSTTRA - Round 1
        String s = "I am Saumya Singh";
        reverseStringSimple(s);
    }

    private static void reverseStringSimple(String s) {
        String data = "";
        for(int i = s.length()-1;i>=0;i--){
            data = data+s.charAt(i);
        }
        System.out.println(data);
    }
}
