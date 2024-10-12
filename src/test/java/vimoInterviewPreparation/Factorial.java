package vimoInterviewPreparation;

public class Factorial {
    public static void main(String[] args){
        System.out.println(getFactorial(5));
        System.out.println(recursiceFact(5));
    }


    public static int getFactorial(int number){
        int mul = 1;
        for(int i=1;i<=number;i++){
            mul = mul*i;
        }
        return mul;
    }

    public static int recursiceFact(int number){
        if(number<=1)
            return number;
        return (number * recursiceFact(number-1));
    }
}
