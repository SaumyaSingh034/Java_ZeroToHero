package December2024Prep;

public class FibonacciRecursion {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.print(fibonnaci(i)+" ");
        }
    }

    private static int fibonnaci(int i) {
        if(i<=1){
            return i;
        }
        return fibonnaci(i-1) + fibonnaci(i-2);
    }
}
