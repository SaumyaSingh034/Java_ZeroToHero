package AbstractInterface;

public class StringTest {
        public static void main(String[] args) {
            String s = "123";
            String s1 = "8643556";

            // Initialize a StringBuilder to store the result
            StringBuilder result = new StringBuilder();

            // Iterate through the characters of s1
            for (int i = 0; i < s1.length(); i++) {
                char charS1 = s1.charAt(i);
                char charS;

                // If the index is within the bounds of s, subtract the corresponding characters
                if (i < s.length()) {
                    charS = s.charAt(i);
                    // Calculate the new character by subtracting and adding '0' to convert back to char
                    char newChar = (char) ('0' + (charS1 - '0') + (10 - (charS - '0')) % 10);
                    result.append(newChar);
                } else {
                    // If s has been fully processed, append the remaining characters from s1
                    result.append(charS1);
                }
            }

            // Print the final result
            System.out.println(result.toString());
        }
    }


