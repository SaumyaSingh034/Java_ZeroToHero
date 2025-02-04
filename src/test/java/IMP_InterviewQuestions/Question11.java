package IMP_InterviewQuestions;

import java.util.Arrays;

public class Question11 {
    public static void main(String[] args){
        //OSTTRA
        /*
        Two array
        [2,4,7,3] [5,6,5,2] add these two array and carry forward thetwo digit number;

         */
//        int[] arr1 = {2,4,7,3};
//        int[] arr2 = {5,6,5,2};

        int[] arr1 = {3,8,7,9};
        int[] arr2 = {5,8,7,9};
        //9 7 5 8
        int sum = 0;
        int result[] = new int[arr1.length];
        for(int i=arr1.length-1;i>=0;i--){
            int num = arr1[i] + arr2[i];
            if(num<10){
                result[i] = num+sum;
            }else{
                int rem = num/10;
                int d = num%10;
                result[i] = d+sum;
                sum = rem;

            }
        }
        System.out.println(Arrays.toString(result));
    }
}
