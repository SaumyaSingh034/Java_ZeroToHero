package SDETInvertiewQuestions;

public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 371;
        int actual = num;
        double result = 0;
        while(num!=0){
            int n = num % 10;
            result = result +Math.pow(n,3);
            num = num/10;
        }
        if(result == actual)
            System.out.println(result+" Is a Armstrong Number");
        else{
            System.out.println(result+" Is not a Armstrong Number");
        }
    }
}
