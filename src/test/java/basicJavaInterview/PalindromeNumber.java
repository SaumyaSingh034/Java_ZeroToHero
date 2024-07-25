package basicJavaInterview;

public class PalindromeNumber {

    public static void main(String[] args){
        System.out.println(isPalindrome(567));
        System.out.println(isPalindrome(565));
        System.out.println(isPalindrome(5));
    }

    private static boolean isPalindrome(int i) {
        int number = i;
        int reverse= 0 ;
        int n;
        while(i>0){
           n = i%10;
           reverse = reverse * 10+ n;
           i = i/10;

        }
        System.out.println(reverse);
        if(number == reverse)
            return true;
        else
            return false;
    }
}
