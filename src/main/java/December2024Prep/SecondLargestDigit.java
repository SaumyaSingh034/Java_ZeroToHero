package December2024Prep;

public class SecondLargestDigit {
    public static void main(String[] args){
        String s = "dfa12321afd";
        String s1 = "abc1111";
        System.out.println(printSecondLargestDigit(s1));
    }

    private static int printSecondLargestDigit(String s) {
        char[] ch = s.toCharArray();
        int[] arr = new int[s.length()];
        int j=0;
        for(char c : ch){
            if(Character.isDigit(c)){
                arr[j] = Integer.parseInt(String.valueOf(c));
                j++;
            }
        }
        int secondMax= 0;
        int max = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax) {
                secondMax = arr[i];

            }
        }
        if(max==secondMax){
            return -1;
        }else
            return secondMax;
    }
}
