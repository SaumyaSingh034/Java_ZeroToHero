package basicJavaInterview;

public class DuplicateNumber {
    public static void main(String[] args){
        int[] arr = {4,5,6,6,7,8,8,7,5,1,2};
        for(int i=0;i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
}
