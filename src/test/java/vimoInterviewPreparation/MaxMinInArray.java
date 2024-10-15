package vimoInterviewPreparation;

public class MaxMinInArray {
    public static void main(String[] args) {
        System.out.println(max(new int[] {4, 781, 8, 99, 103})); // 781
        System.out.println(max(new int[] {1, 2, 3, 4, 5})); // 5
        System.out.println(max(new int[] {3, 4})); // 4
        System.out.println(max(new int[] {100})); // 100

        System.out.println(min(new int[] {4, 781, 8, 99, 103})); // 4
        System.out.println(min(new int[] {1, 2, 3, 4, 5})); // 1
        System.out.println(min(new int[] {3, 4})); // 3
        System.out.println(min(new int[] {100})); // 100
    }

    private static int max(int[] data) {
        int max = 0;
        for(int i=0;i< data.length;i++){
            if(data[i]>max){
                max = data[i];
            }
        }
        return max;
    }


    private static int min(int[] data){
        int min = data[0];
        for(int i=0;i<data.length;i++){
            if(data[i]<min){
                min = data[i];
            }
        }
        return min;
    }


}
