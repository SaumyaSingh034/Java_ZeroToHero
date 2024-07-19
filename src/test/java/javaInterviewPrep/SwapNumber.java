package javaInterviewPrep;

public class SwapNumber {
    public static void main(String[] args){
        int a = 10;
        int b = 80;
        swapNumbers(a, b);

    }

    private static void swapNumbers(int a, int b) {
        b = b+a;
        a = b-a;
        b = b-a;

        System.out.println("Swapped Number a: "+a+ " b: "+b);

    }
}
