package LinkedInJavaProblems;

public class MissingSortedArray {

    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,7,8};
        int sum = 0;
        int sumTo = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        for(int j=1;j<=arr.length;j++)
        {
            sumTo += j;
        }
        System.out.println(sumTo-sum);
    }
}
