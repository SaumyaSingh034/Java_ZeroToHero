package hackerRank;

public class isPrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(7))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
