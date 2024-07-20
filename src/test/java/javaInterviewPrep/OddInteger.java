package javaInterviewPrep;

public class OddInteger {

    public static void main(String[] args){
        int number = 78;

        System.out.println(oddIntegerMethod(number));
        System.out.println(oddIntegerMethod(13));
        System.out.println(oddIntegerMethod(4));
        System.out.println(oddIntegerMethod(589559));
    }

    private static boolean oddIntegerMethod(int number) {
        if(number%2==0)
            return false;
        else
            return true;

    }
}
