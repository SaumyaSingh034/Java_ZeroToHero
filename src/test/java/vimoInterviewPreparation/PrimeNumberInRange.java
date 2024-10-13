package vimoInterviewPreparation;

public class PrimeNumberInRange {

    public static void main(String[] args){
        int start = 1;
        int end = 15;
        for(int i=start;i<=end;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int i) {
        if(i<=1)
            return false;

        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0) {
                return false;
            }

        }
        return true;
    }
}
