import java.util.Arrays;

public class Test {

    public static void main(String[] args){
        int arr[] = {1,0,3,0,1,0,5};
        moveZeroAtEnd(arr);
    }

    private static void moveZeroAtEnd(int[] arr) {
        int j = 0;
        int len = arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }

        }
        for(int i=j;i< arr.length;i++){
            arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));

    }
}
