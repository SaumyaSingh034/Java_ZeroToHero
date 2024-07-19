package javaInterviewPrep;

public class FibonacciSeries {

    public static void main(String[] args){
        int number = 11;

        printFibonacciSeries(number);
    }

    private static void printFibonacciSeries(int number) {
        int a = 0;
        int b = 1;
        int temp= 1;
        for(int i=1;i<=number;i++){
          System.out.print(a+", ");
          a = b;
          b = temp;
          temp = a+b;
        }
    }
}
