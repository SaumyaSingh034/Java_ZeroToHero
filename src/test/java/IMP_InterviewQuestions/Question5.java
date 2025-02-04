package IMP_InterviewQuestions;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args){
        //Brightly Software - 2nd Round
        /*
        Shift the 0 to the end of the array
         */
        int[] arr = {1,0,3,5,0,1};
        shiftZeroToEndOfArray(arr);

    }

    private static void shiftZeroToEndOfArray(int[] arr) {
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            }
        }
        for(int i=j;i< arr.length;i++){
            arr[j++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
