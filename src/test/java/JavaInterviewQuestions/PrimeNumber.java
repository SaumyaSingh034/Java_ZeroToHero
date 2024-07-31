package JavaInterviewQuestions;

public class PrimeNumber {

    public static void main(String[] args)
    {
        System.out.println(isPrimeNumber(7));
    }

    private static boolean isPrimeNumber(int num) {

        if(num == 0 || num == 1)
            return false;
         if (num == 2)
            return true;
         for(int i=2;i<num/2;i++){
             if( num % i ==0)
                 return false;
         }
         return true;

    }
}
