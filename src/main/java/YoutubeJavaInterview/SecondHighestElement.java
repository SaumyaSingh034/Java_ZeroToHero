package YoutubeJavaInterview;

public class SecondHighestElement {
    public static void main(String[] args){
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        secondHightestElementInArray(arr);
    }

    private static void secondHightestElementInArray(int[] arr) {
        int largest = 0;
        int secondL = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondL = largest;
                largest=arr[i];
            } else if (arr[i]>secondL) {
                secondL = arr[i];

            }
        }
        System.out.println(secondL);
    }
}
