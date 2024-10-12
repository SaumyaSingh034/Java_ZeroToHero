package vimoInterviewPreparation;

public class RecursiveFibonacci {

    public static void main(String[] args){
        for(int i=0;i<15;i++){
            System.out.print(fibonacci(i)+" ");
        }

    }

    private static int fibonacci(int number){
        if(number<=1)
            return number;
        return fibonacci(number-1)+fibonacci(number-2);
    }
}
