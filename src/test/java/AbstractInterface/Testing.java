package AbstractInterface;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[] = {3,4};

        combineTwoArrays(arr1, arr2);
    }
    
    public static void combineTwoArrays(int arr1[], int arr2[]){
        int length = arr1.length+arr2.length;
        int result[] = new int[length];
        int j=0;
        for(int i=0;i< arr1.length;i++){
            result[i] = arr1[i];
            j++;
        }
        for(int i = 0;i<arr2.length;i++){
            result[j++] = arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
