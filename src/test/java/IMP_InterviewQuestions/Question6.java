package IMP_InterviewQuestions;

public class Question6 {
    static int i = 3;
    public static void main(String[] args){
        /* Static keyword conceptual questions

         */
        System.out.println(i+" "); //3
       add(i);
        System.out.println(i+" "); //3
    }

    private static int add(int i) {
        i+=5;
        return i;
    }
}
