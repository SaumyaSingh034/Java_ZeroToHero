package YoutubeJavaInterview;

public class PrimeNumber {
    public static void main(String[] args){
        int number = 7;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        if(number==0 || number == 1)
            return false;
        if(number == 2)
            return true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0) {
                return false;
            }

        }

        return true;
    }
}
