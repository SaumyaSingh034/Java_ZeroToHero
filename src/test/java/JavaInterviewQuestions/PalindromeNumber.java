package JavaInterviewQuestions;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(6778776));
        System.out.println(isPalindromeNumber(-1));
        System.out.println(isPalindromeNumber(1));
        System.out.println(isPalindromeNumber(22));
        System.out.println(isPalindromeNumber(6577));
    }

    private static boolean isPalindromeNumber(int i) {
        int reverse = 0;
        int number = i;
        while (i > 0) {
            int n = i % 10;
            reverse = reverse * 10 + n;
            i = i / 10;
        }
        if (reverse == number)
            return true;
        else return false;
    }
}
