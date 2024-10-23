package InterviewPrep;

public class MaxMinInArray {

    public static void main(String[] args){
        int[] numbers = {34,23,67,21,38};
        int min = numbers[0];
        int max = numbers[0];

        for(int n : numbers){
            if(n<min)
                min = n;
            if(n>max)
                max = n;
        }
        System.out.println("Min number is : "+min+" Maximum Number is : "+max);
    }
}
