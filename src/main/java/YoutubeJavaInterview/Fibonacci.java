package YoutubeJavaInterview;

public class Fibonacci {
    public static void main(String[] args){
        int number = 5;
        printFibonnaciSeries(number);
    }

    private static void printFibonnaciSeries(int number) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i=0;i<=number;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}
