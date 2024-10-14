package vimoInterviewPreparation;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPal(545)); // true
        System.out.println(isPal(1001)); // true
        System.out.println(isPal(13)); // false
        System.out.println(isPal(33)); // true
    }

    private static boolean isPal(int i) {
        int number = i;
        int rev = 0;
        int rem ;
        while(i>0){
            rem = i%10;
            rev = (rev*10) + rem;
            i = i/10;
        }
        return rev == number;
    }
}
