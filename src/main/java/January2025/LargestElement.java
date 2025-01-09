package January2025;

public class LargestElement  {
    public static void main(String[] args){
        int arr[] = {4,5,7,8,9,10,1,2,3};
        printLargestElement(arr);

    }

    private static void printLargestElement(int[] arr) {
        int max = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
