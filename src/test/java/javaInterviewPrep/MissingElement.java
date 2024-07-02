package javaInterviewPrep;

public class MissingElement {

    public static void main(String args[]){
        int[] arr = {1,2,4,5,6,7,8,9,10};
        findMissingElement(arr);
    }

    private static void findMissingElement(int[] arr) {
        int sum = 0;
        int lastIndex = arr[arr.length-1];
        for(int i=0;i< arr.length;i++)
        {
            sum += arr[i];
        }
        int data = 0;
        for(int i=0;i<=lastIndex;i++)
            data = data+i;

        System.out.println(data-sum);
    }
}
