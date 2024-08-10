package SDETInvertiewQuestions;

public class SumOfDigits {

    public static void main(String[] args){
        int number = 67853; // 29
        int sum = 0;
        int n;
        while(number>0){
            n = number%10;
            sum += n;
            number = number/10;

        }
        System.out.println(sum);
    }
}
