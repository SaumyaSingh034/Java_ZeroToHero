package linkedIn;

public class IntegerArrayCount {
    public static void main(String[] ar){
        int[] arr = {1,3,5,2};
        int st = 1;
        int end = 5;
        getTheCountofArray(arr, st, end);
    }

    private static void getTheCountofArray(int[] arr, int st, int end) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=st && arr[i]<=end)
                count++;
        }
        System.out.println(count);
    }
}
