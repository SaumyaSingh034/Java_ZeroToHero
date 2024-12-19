package December2024Prep;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 5};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println(max);
    }
}
