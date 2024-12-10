package InterviewPrep2024;

public class FibonacciSeries {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int sum;
        for(int i=1;i<=8;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}
