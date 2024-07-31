package JavaInterviewQuestions;

import java.util.Arrays;

public class ArraySortingLinear {

    public static void main(String[] args){
        int[] ar = {4,2,3,1,6,8,5,7};
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
