package patternLogic;

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print the pattern
        int num = 1; // Starting number
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num); // Print the current number
                num++;                 // Increment the number
            }
            System.out.println();      // Move to the next line
        }

        scanner.close();
    }
}
