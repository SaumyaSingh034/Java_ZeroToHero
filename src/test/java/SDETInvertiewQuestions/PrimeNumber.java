package SDETInvertiewQuestions;

public class PrimeNumber {

    public static void main(String[] args){
        int number = 9;
        System.out.println(isPrimeNumber(number));
        System.out.println(isPrimeNumber(1));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(71));
        System.out.println(isPrimeNumber(13));
    }

    private static boolean isPrimeNumber(int number) {
        if(number == 0 || number == 1)
            return false;
        if(number==2)
            return true;
        for(int i=2;i<number/2;i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
