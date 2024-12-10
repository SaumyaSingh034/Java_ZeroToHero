package InterviewPrep2024;

public class SecondLargestElement {

    public static void main(String[] args){
        int[] arr ={5,6,7,8,10,11,15,18,20};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int max = 0;
        int secondMax = 0;
        for(int i=0;i< arr.length;i++){
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
