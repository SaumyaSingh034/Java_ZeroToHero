package AbstractInterface;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args){
        int[] array1 = {2,4,7,3};
        int[] array2 = {5,6,7,9};

        /*7, 10, 12, 7
        8, 0, 12, 7
        8, 1, 2, 7*/
        //       8,1,5,2
        printSumOfArray(array1, array2);

    }

    private static void printSumOfArray(int[] array1, int[] array2) {
        int[] sum = new int[array1.length];
        for(int i = 0;i< array1.length;i++){
                sum[i] = array1[i]+array2[i];
                if(sum[i]>9){
                    int num = sum[i];
                    int rem = num%10; //10 0
                    num = num/10; //1
                    sum[i-1] = sum[i-1]+num;
                    sum[i] = rem;
                }
            }
        System.out.println(Arrays.toString(sum));
        }
    }

