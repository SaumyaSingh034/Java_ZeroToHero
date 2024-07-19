package javaInterviewPrep;

public class CheckNumberIsPrime {

    public static void main(String[] args) {
        int number = 171;
        System.out.println(isPrime(173));
        System.out.println(isPrime(19));
        System.out.println(isPrime(49));
    }
    private static boolean isPrime(int number){
        if(number ==0 || number == 1){
            return false;
        }
        if(number == 2)
            return true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
