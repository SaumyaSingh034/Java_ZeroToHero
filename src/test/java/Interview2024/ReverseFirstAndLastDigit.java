package Interview2024;

import java.util.Scanner;

public class ReverseFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 10) {
            System.out.println("The number is a single-digit number, reversing is not applicable.");
        } else {
            int originalNumber = number;

            // Extract last digit
            int lastDigit = number % 10;

            // Find the total number of digits in the number
            int digitCount = (int) Math.log10(number) + 1;

            // Find the first digit
            int firstDigit = (int) (number / Math.pow(10, digitCount - 1));

            // Remove the first digit
            number = number % (int) Math.pow(10, digitCount - 1);

            // Remove the last digit
            number = number / 10;

            // Reconstruct the number with swapped first and last digits
            int reversedNumber = (lastDigit * (int) Math.pow(10, digitCount - 1)) + (number * 10) + firstDigit;

            System.out.println("Number after reversing first and last digits: " + reversedNumber);
        }

        scanner.close();
    }
}
