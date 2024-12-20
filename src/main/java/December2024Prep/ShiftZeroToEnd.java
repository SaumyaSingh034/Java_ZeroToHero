package December2024Prep;

import java.util.Arrays;

public class ShiftZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 0, 5, 0, 1, 2, 0, 3, 4, 0, 6, 7};
        shiftZeroToEnd(arr);
    }

    private static void shiftZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
