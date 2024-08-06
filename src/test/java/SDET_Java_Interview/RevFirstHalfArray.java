package SDET_Java_Interview;

public class RevFirstHalfArray {

    public static void main(String[] args){
        int[] arr = {10,2,5,4,6,9,3};
        int length = arr.length;
        for(int i=0;i<length/4;i++) {
            int t = arr[i];
            arr[i] = arr[length/2-i-1];
            arr[length/2-i-1] = t;
        }

        for(int j=0;j<length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
