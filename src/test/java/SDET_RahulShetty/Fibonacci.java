package SDET_RahulShetty;

public class Fibonacci {
    public static void main(String[] args)
    {
        int number = 8;
        int a = 1;
        int temp =1;
        int sum = 0;
        for(int i=0;i<=number;i++){
            System.out.print(sum+" ");
            sum = a;
            a = temp;
            temp =sum+a;

        }
    }}
