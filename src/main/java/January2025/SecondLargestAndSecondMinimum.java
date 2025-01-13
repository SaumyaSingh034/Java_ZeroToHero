package January2025;

public class SecondLargestAndSecondMinimum {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8};
        int secondLar = findSecondLargest(arr);
        int secondMini = findSecondSmallest(arr);
        System.out.println("Second Largest: "+secondLar+" Second Smallest: "+secondMini);
    }

    private static int findSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                sMin = min;
                min = arr[i];

            } else if (sMin>arr[i]) {
                sMin = arr[i];

            }
        }
        return sMin;
    }

    private static int findSecondLargest(int[] arr) {
        int max= 0 ,  sMax = 0;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                sMax = max;
                max = arr[i];

            } else if (sMax<arr[i]) {
                sMax = arr[i];

            }
        }
        return sMax;
    }
}
