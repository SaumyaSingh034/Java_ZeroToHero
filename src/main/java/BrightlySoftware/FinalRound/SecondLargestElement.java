package BrightlySoftware.FinalRound;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {7,8,9,10,11,12,13,14,15};
        System.out.println(secondLargestElement(arr));
    }

    private static int secondLargestElement(int[] arr) {
        int max = 0;
        int secMax = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];

            } else if (arr[i]>secMax) {
                secMax = arr[i];

            }

        }
        return secMax;
    }
}
