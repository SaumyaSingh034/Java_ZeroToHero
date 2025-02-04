package IMP_InterviewQuestions;

public class Question3 {
    public static void main(String[] args) {
        //Vimo Fitment - Internal Fitment
        //Print pattern
        /*
        SAUMYA
        SAUMY
        SAUM
        SAU
        SA
        S
         */

        String str = "SAUMYA";
        for(int i=str.length();i>0;i--){
            System.out.println(str.substring(0,i));
        }
        System.out.println("************************");
        for(int i=0;i<=str.length();i++){
            System.out.println(str.substring(0,i));
        }

    }
}
