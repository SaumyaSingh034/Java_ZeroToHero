package JavaInterviewQuestions;

public class FibonacciSeries {

    public static void main(String[] args){
        printFibonacciSeries(5);
    }

    private static void printFibonacciSeries(int num) {
        int a = 0;
        int b = 1;
        int sum=1;
        for(int i = 1;i<=num;i++){
            System.out.print(a+" ");
            a = b;
            b= sum;
            sum = a+b;



        }
    }
}
