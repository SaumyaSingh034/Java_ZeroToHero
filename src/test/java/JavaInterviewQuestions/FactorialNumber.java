package JavaInterviewQuestions;

public class FactorialNumber {
    public static void main(String[] args){
        System.out.println(printFactorialofNumber(5));
        System.out.println(printFactorialofNumber(2));
        System.out.println(printFactorialofNumber(10));
    }

    private static int printFactorialofNumber(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}
