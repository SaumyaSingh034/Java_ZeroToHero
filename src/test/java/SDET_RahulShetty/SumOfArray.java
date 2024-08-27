package SDET_RahulShetty;

public class SumOfArray {

    private int getSumOfArray(int[] arr){
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        SumOfArray soa = new SumOfArray();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {0};
        int[] arr3 = {14,5,9,0,5};
        int[] arr4 = {11,42,73,884,765};
        System.out.println(soa.getSumOfArray(arr1));
        System.out.println(soa.getSumOfArray(arr2));
        System.out.println(soa.getSumOfArray(arr3));
        System.out.println(soa.getSumOfArray(arr4));
    }
}
