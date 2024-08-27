package SDET_RahulShetty;

public class MaxAdjacentArray {
    private int maxDifferenceAdjacentArray(int[] arr){
        int max = 0;
        int difference;
        for(int i=0;i< arr.length-1;i++){
            difference = arr[i+1] - arr[i];
            if(max<difference)
                max = difference;
        }
        return max;
    }

    public static void main(String[] args){
        MaxAdjacentArray adj = new MaxAdjacentArray();
        int[] arr = {1,4,8,15,17};
        System.out.println(adj.maxDifferenceAdjacentArray(arr));
    }
}
