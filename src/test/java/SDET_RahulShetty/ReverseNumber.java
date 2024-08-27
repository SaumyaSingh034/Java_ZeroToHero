package SDET_RahulShetty;

public class ReverseNumber {
    public static void main(String[] args){
        int number = 987;
        int reverse = 0;
        while(number>0){
            int digit = number%10;
            reverse = digit+reverse*10;
            number = number/10;
        }
        System.out.println(reverse);
    }
}
