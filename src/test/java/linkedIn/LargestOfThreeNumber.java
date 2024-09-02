package linkedIn;

public class LargestOfThreeNumber {
    public static void main(String[] args){
        int num1 = 9;
        int num2 = 10;
        int num3 = 5;

        printLargestNumber(num1,num2,num3);
    }

    private static void printLargestNumber(int num1, int num2, int num3) {
        if(num1>num2 && num1>num3)
            System.out.println(num1);
        else if (num2>num1 && num2>num3) {
            System.out.println(num2);
        }
        else
            System.out.println(num3);
    }
}
