package AbstractInterface;

public class ReverseOnlyStrings {
    public static void main(String[] args) {
        String input = "34test909gda@sdet!23pro";
        String result = reverseOnlyAlphabets(input);
        System.out.println(result); // Output: 34tset909adg@teds!23orp
    }


    private static String reverseOnlyAlphabets(String x) {
        char[] ch = x.toCharArray(); // Convert the string to a character array
        StringBuffer alphabets = new StringBuffer(); // To store alphabetic characters

        // Collect all alphabetic characters
        for (char c : ch) {
            if (Character.isAlphabetic(c)) {
                alphabets.append(c);
            }
        }

        // Reverse the alphabetic characters
        alphabets.reverse();

        StringBuffer result = new StringBuffer(); // To store the final result
        int alphaIndex = 0;

        // Rebuild the string with reversed alphabetic characters
        for (char c : ch) {
            if (Character.isAlphabetic(c)) {
                // Replace alphabetic characters with reversed ones
                result.append(alphabets.charAt(alphaIndex));
                alphaIndex++;
            } else {
                // Keep non-alphabetic characters in their original position
                result.append(c);
            }
        }

        return result.toString(); // Return the final result as a String
    }
}