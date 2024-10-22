package Practice;

public class SecondHighestElement {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,10,11};
        int second = secondLargestElementInArray(arr);
        System.out.println(second);
    }

    private static int secondLargestElementInArray(int[] arr) {
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
