package BrightlySoftware;

public class PairSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int k = 31;

        int count = countTinyPairs(a, b, k);
        System.out.println("Number of tiny pairs: " + count);
    }

    public static int countTinyPairs(int[] a, int[] b, int k) {
        int count = 0;

        // Loop through each element in array a

        for (int i = 0; i < a.length; i++) {
            // Loop through each element in array b
            for (int j = 0; j < b.length; j++) {
                // Concatenate a[i] and b[j] as strings
                String concatenated = "" + a[i] + b[j];

                // Convert the concatenated string to an integer
                int concatenatedValue = Integer.parseInt(concatenated);

                // Check if the concatenated value is less than k
                if (concatenatedValue < k) {
                    count++;  // Increment the count if the condition is met
                }
            }
        }

        return count;
    }
}
