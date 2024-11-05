package November;

public class LargestValueInArray {
    public static void main(String[] ags){
        int[] arr={28,3,15,9,17,4,23,2, 35};
       System.out.println( findLargestValue(arr));
       System.out.println(FindSecondLargestElement(arr));
    }

    private static int findLargestValue(int[] arr) {
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    private static int FindSecondLargestElement(int[] arr){
        int max = 0;
        int secLar = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secLar = max;
                max = arr[i];
            }
           else if(arr[i]>secLar)
                secLar = arr[i];
        }
        return secLar;
    }
}
