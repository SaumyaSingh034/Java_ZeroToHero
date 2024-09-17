package Interview2024;

public class MaxLengthWord {

    public static void main(String[] args) {
        String str = "Hi my name is Saumya";
        System.out.println(printLongestWord(str));
        System.out.println(printLongestWord("Tryaksh is a good boy and Brilliant"));
        System.out.println(printLongestWord("Tryaksh Tryaksh Tryaksh Tryaksh"));
        System.out.println(printLongestWord("Hicfsdfdfdf"));
    }

    private static String printLongestWord(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        } else {
            String[] words = str.split("\\s");
            int size = 1;
            String max = null;
            for (String word : words) {
                if (size < word.length()) {
                    size = word.length();
                    max = word;
                }
            }
            return max;
        }
    }
}
