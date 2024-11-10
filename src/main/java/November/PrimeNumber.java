package November;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(35)); // false
        System.out.println(isPrime(20)); // false
        System.out.println(isPrime(27)); // false
        System.out.println(isPrime(7));

    }

    private static boolean isPrime(int number){
        if(number==0 || number==1)
            return false;
            for(int i=2;i<=number/2;i++){
                if(number%i==0)
                    return false;

            }

        return true;
    }
}
