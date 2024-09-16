package JSON_Jackson;

public class Fibonacci {

    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int sum ;
        for(int i =1;i<=10;i++){
            System.out.print(a+" ");
            sum = a+ b;
            a = b;
            b = sum;
        }
    }
}
