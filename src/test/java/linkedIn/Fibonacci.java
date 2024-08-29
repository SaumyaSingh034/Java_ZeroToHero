package linkedIn;

public class Fibonacci {

    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        f.fibo(8);

    }

    protected void fibo(int number){
        int a = 0;
        int b = 1;
        int temp = 0;
        for(int i=1;i<=number;i++){

            System.out.print(a+" ");
            temp = a+b;
            a= b;
            b = temp;

        }
    }
}
