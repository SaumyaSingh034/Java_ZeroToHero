package Tata;

public class SecondLargestElemnt {
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,20};
        System.out.println(printSecondLargestElement(arr));
    }

    private static int printSecondLargestElement(int[] arr) {
        int max = 0;
        int secondMax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax) {
                secondMax = arr[i];

            }
        }
        return secondMax;
    }
}
