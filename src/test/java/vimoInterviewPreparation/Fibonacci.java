package vimoInterviewPreparation;

public class Fibonacci {
    public static void main(String[] args){
        int a = 0, b = 1;
        int sum;
        for(int i=1;i<=10;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b= sum;
        }
        System.out.println("**************");
       for(int i=0;i<10;i++){
           System.out.print(recursiveFibonacci(i)+ " ");
       }
    }

    private static int recursiveFibonacci(int number){
        if(number<=1)
            return number;
        return recursiveFibonacci(number-1)+recursiveFibonacci(number-2);
    }
}
