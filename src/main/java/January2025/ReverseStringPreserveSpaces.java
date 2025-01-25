package January2025;

public class ReverseStringPreserveSpaces {

    public static String reverseStringWithSpaces(String input) {
        // Convert the input string to a character array
        char[] inputArray = input.toCharArray();
        // Create an array to store the result with the same length as the input
        char[] result = new char[inputArray.length];
        
        // Fill the result array with spaces
        for (int i = 0; i < result.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        
        // Use two pointers: one for iterating the input and another for placing characters in result
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        
        return new String(result);
    }

    public static void main(String[] args) {
        String input = "I love programming";
        String result = reverseStringWithSpaces(input);
        System.out.println("Input:  \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
