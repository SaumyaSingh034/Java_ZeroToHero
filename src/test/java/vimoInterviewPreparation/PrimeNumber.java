package vimoInterviewPreparation;

public class PrimeNumber {
    public static void main(String[] args){

        System.out.println(checkPrimeNumber(8));
        System.out.println(checkPrimeNumber(1));
        System.out.println(checkPrimeNumber(2));
        System.out.println(checkPrimeNumber(0));
        System.out.println(checkPrimeNumber(3));
//        checkPrimeNumber(1);
//        checkPrimeNumber(2);

    }

    public static boolean checkPrimeNumber(int number){
        if(number == 0|| number == 1 ){
            return false;
        }
        if(number == 2) {
            return true;
        }
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0)
                   return false;
            }
        return true;
    }
}
