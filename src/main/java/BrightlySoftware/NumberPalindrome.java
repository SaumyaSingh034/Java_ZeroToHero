package BrightlySoftware;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPal(545)); // true
        System.out.println(isPal(1001)); // true
        System.out.println(isPal(13)); // false
        System.out.println(isPal(33)); // true
    }

    private static boolean isPal(int i) {
        int rem;
        int original = i;
        int reverse = 0;

        while(i>0){
            rem = i%10;
            reverse = (reverse * 10) + rem;
            i = i/10;


        }
        return reverse == original;
    }
}
