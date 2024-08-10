package SDETInvertiewQuestions;

public class FibonacciSeries {
    public static void main(String[] args){
        int a = 0;
        int b= 1;
        int sum=1;
        for(int i=0;i<=5;i++){
            System.out.print(a+" ");
            a = b;
            b = sum;
            sum = a+b;
        }
    }
}
