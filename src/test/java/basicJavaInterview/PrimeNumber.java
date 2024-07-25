package basicJavaInterview;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 67;
        System.out.println(checkNumberIsPrime(number));
        System.out.println(checkNumberIsPrime(2));
        System.out.println(checkNumberIsPrime(67));
        System.out.println(checkNumberIsPrime(13));
        System.out.println(checkNumberIsPrime(9081));
        System.out.println(checkNumberIsPrime(7844217));
    }

    private static boolean checkNumberIsPrime(int number) {
        if (number == 0 || number == 1)
            return false;
        if (number == 2)
            return true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
