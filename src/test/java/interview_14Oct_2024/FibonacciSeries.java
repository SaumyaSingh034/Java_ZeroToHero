package interview_14Oct_2024;

public class FibonacciSeries {
    public static void main(String[] args){
       for(int i=0;i<5;i++)
           System.out.print(fibonacciPrint(i)+ " ");
    }

    private static int fibonacciPrint(int i) {
        if(i<=1)
            return i;
        else
            return fibonacciPrint(i-1)+fibonacciPrint(i-2);
    }
}
