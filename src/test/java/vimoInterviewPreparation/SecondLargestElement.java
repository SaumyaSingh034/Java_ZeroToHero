package vimoInterviewPreparation;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {45,33,42,11,23,9,67,89};
        System.out.println(secondLargestElement(arr));
        System.out.println(secondlargest(arr));

    }
    public static int secondLargestElement(int[] arr){
       int second = 0;
       int largest = 0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
               second = largest;
               largest = arr[i];
           }
           else if(arr[i]>second ){
               second=arr[i];
           }
       }
       return second;
    }

    public static int secondlargest(int[] arr){
        int max = 0;
        int secondLargest = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                secondLargest = max;
                max = arr[i];
            }
            else{
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
