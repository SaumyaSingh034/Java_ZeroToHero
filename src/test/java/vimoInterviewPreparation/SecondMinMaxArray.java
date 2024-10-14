package vimoInterviewPreparation;

import java.util.Arrays;

public class SecondMinMaxArray {
    public static void main(String[] args) {
        System.out.println(secMax(new int[]{4, 781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[]{1, 2, 3, 4, 5})); // 4
        System.out.println(secMax(new int[]{3, 4})); // 3

        System.out.println("------");
        System.out.println(secMin(new int[] {4, 781, 8, 99, 103})); // 8
        System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); // 2
        System.out.println(secMin(new int[] {3, 4})); // 4



        System.out.println("------");
        System.out.println(secMin1(new int[] {4, 781, 8, 99, 103})); // 8
        System.out.println(secMin1(new int[] {1, 2, 3, 4, 5})); // 2
        System.out.println(secMin1(new int[] {3, 4})); // 4
    }

    private static int secMax(int[] data) {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > largest) {
                secondLargest = largest;
                largest = data[i];
            } else if (data[i] > secondLargest) {
                secondLargest = data[i];

            }
        }
        return secondLargest;
    }


    private static int secMin(int[] data) {
        Arrays.sort(data);
        return data[1];

    }

    private static int secMin1(int[] data) {
      int min = data[0];
      int secMin = data[0];

      for(int i=0;i< data.length;i++){
          if(data[i]<min){
              secMin = min;
              min = data[i];
          } else if (data[i]<secMin) {
              secMin = data[i];

          }
      }
      return secMin;

    }


}
